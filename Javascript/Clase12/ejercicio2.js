function createTaskManager() {
    let tasks = [];
    let idCounter = 1; // Para asignar un ID único a cada tarea

    return {
        // Función para agregar una tarea
        addTask: function(taskDescription) {
            const newTask = {
                id: idCounter++,         // ID único
                description: taskDescription, 
                completed: false         // Por defecto no está completada
            };
            tasks.push(newTask);
            console.log(`Tarea agregada: "${taskDescription}"`);
        },

        // Función para marcar una tarea como completada usando su ID
        completeTask: function(taskId) {
            const task = tasks.find(t => t.id === taskId);
            if (task) {
                task.completed = true;
                console.log(`Tarea completada: "${task.description}"`);
            } else {
                console.log("Tarea no encontrada");
            }
        },

        // Función para listar todas las tareas
        listTasks: function() {
            console.log("\n Lista de tareas:");
            tasks.forEach(task => {
                const estado = task.completed ? " Completada" : " Pendiente";
                console.log(`${task.id}. ${task.description} - ${estado}`);
            });
        }
    };
}

// Uso del sistema
const myTasks = createTaskManager();

myTasks.addTask("Aprender JavaScript");
myTasks.addTask("Hacer ejercicio");

// Listamos todas las tareas
myTasks.listTasks();

// Completamos la primera tarea
myTasks.completeTask(1);

// Listamos de nuevo para ver el cambio
myTasks.listTasks();
