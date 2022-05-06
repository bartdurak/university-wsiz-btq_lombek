public enum UserRole {

    STUDENT,
    TEACHER,
    ADMINISTRATOR;
        public String getTranslated() {
            switch (this) {
                case STUDENT:
                    return "Student";
                case TEACHER:
                    return "Administrator";

            }
            throw new RuntimeException("Not supported");

        }
}
