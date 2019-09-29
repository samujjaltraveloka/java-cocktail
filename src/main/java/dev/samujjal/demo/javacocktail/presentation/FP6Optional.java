package dev.samujjal.demo.javacocktail.presentation;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

public class FP6Optional {
    public static void main(String[] args) {

        FP6Optional optional = new FP6Optional();
        optional.executor();
    }

    void executor(){
        Employee managerWithNoAddress = new Employee();
        managerWithNoAddress.setId("1");
        managerWithNoAddress.setName("Big Boss");

        Project project = new Project();
        project.setManager(managerWithNoAddress);
        project.setId("123");
        project.setName("Demo");

        String address = project.getManager()
                .flatMap(Employee::getAddress)
                .map(Address::toString)
                .orElse("No Adddress");

        System.out.println(address);
    }

    @Data
    class Project {
        private String id;
        private String name;
        private Optional<Employee> manager = Optional.empty();

        public Optional<Employee> getManager(){
            return this.manager;
        }
        public void setManager(Employee employee){
            this.manager = Optional.of(employee);
        }
    }

    @Data
    class Employee {
        private String id;
        private String name;
        private Optional<Address> address = Optional.empty();
        public Optional<Address> getAddress(){
            return address;
        }

        public void setAddress(Address address){
            this.address = Optional.of(address);
        }
    }

    @Data
    class Address {
        private String city;
        private String state;
        private String country;
    }
}
