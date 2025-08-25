export enum Role {
    STUDENT = "STUDENT",
    TEACHER = "TEACHER",
    ADMIN = "ADMIN"
}

function checkAccess(role: Role): string {
    switch(role) {
        case Role.STUDENT:
            return "Limited access";
        case Role.TEACHER:
            return "Guest access only";
        case Role.ADMIN:
            return "Full access granted";
        default:
            return "No access";
    }
}

console.log(checkAccess(Role.ADMIN));   // Full access granted
console.log(checkAccess(Role.TEACHER)); // Guest access only
