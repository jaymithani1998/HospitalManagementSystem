# Mithani_Jay_002788726_HospitalManagementSystem

The HMS(Hospital Management System) helps patients, community admin, admin user and hospital to manage data

Below roles are present in system:
1. System Admin(CRUD rights) - Can perform CRUD operation on everyone's data
2. Community Adimn - Can perform CRUD operation on Community directory and House directory
3. Doctor - Can add encounter history for patient, which includes vital signs such as : blood pressure and  heart rate
4. Patient - Can view list of available hospital's and doctor's

Vlidations added:
1. Check if atleast one system admin is present in system while performing delete operations
2. Check login credentials and redirect user on associated screen based on assigned access rights
3. Check if age,houseid contains integers in their input field
4. Check if characters are entered in all name fields in each section (no alphanumeric allowed)
5. Check if field is not null