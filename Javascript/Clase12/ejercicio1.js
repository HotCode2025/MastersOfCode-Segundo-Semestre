function validatePassword(password) {
    // Verificar que tenga al menos 8 caracteres
    if (password.length < 8) {
        return false;
    }

    // Verificar que tenga al menos un número
    const tieneNumero = /[0-9]/.test(password);

    // Verificar que tenga al menos una letra mayúscula
    const tieneMayuscula = /[A-Z]/.test(password);

    // Retornar true solo si cumple todas las condiciones
    return tieneNumero && tieneMayuscula;
}

// Pruebas
console.log(validatePassword("Abc12345")); // true 
console.log(validatePassword("weak"));     // false 
console.log(validatePassword("password1")); // false  (sin mayúscula)
console.log(validatePassword("StrongPass1")); // true 
