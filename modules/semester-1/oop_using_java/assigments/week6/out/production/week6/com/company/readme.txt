
Write the following –
A Building class with –
    Attributes – name, building code, location, number of floors and total area.
    Methods - This class must implement a method that prints all building details. (How will you achieve this?).
A Department class with –
    Attributes – name, building, head of the department (can be a Medical or Non-Medical staff) and list of employees
    Methods –
        This class must implement a method that prints all department details including the list of employees. (How will you achieve this?).
        Add appropriate checks before assigning a HOD.
A Person class with –
        Attributes – name, gender and date of birth (import the Date class and use it instead of using String).
        Implementation – This system assumes that there are no Person objects.
        Subclass – Employee
            Attributes – employee id, department, designation, email id, phone number and salary
Employee has two subclasses -
    MedicalStaff
        Attributes – specialization, registration number, years of medical experience,
        whether a medical staff is a doctor or not, whether a medical staff is a visiting consultant or not.
        Methods –
            Provide an implementation for the inherited method which returns a Boolean value based on whether
            an employee is medical staff or not.
            Provide an implementation for the inherited method that prints all details of each medical staff.
            (How can you do this?)
            A method which returns a Boolean value based on whether a doctor is a visiting consultant or not.
    NonMedicalStaff
        Attributes – is an administrative staff or not, is a manager or not
        Methods –
            Provide an implementation for the inherited method which returns a Boolean value based on whether a medical staff or not.
            Provide an implementation for the inherited method that prints all details of each employee.
Hospital class with –
    Attributes – name, location, list of departments
    Methods –
        This class must implement a method that prints all details. (How will you achieve this?).
        When you print details of a hospital, details of all departments and details of each employee in that department should be printed.
