package lesson3;

public class CreateEmployee {

    public static void main(String[] args) {

        Employee[] arrayEmployee = new Employee[5];

        arrayEmployee[0] = new Employee("Иванов Иван Иванович", "Экономист", "economist@mail.ru", "+37529745156", 50, 40);
        arrayEmployee[1] = new Employee("<Брежнев Василий Иванович>", "Прораб", "prorab@mail.ru", "+375295124049", 45, 54);
        arrayEmployee[2] = new Employee("Сидоров Андрей Иванович", "Фельдшер", "feldsher@mail.ru", "+375445774407", 38, 61);
        arrayEmployee[3] = new Employee("<Быков Андрей Евгеньевич>", "Врач", "vrach@mail.ru", "+375335547951", 76, 36);
        arrayEmployee[4] = new Employee("Клепиков Антон Сергеевич", "Ветврач", "opvk@mail.ru", "+37297143431", 74, 26);

        for (Employee employee : arrayEmployee) {
            if (employee.age > 40) {
                employee.employeeInfo();
            }
        }
    }
}
