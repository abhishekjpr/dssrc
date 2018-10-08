package com.abhishek.questions.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private int empId;
    private String empName;

    static class InnerEmployee implements Serializable {

        int empCode;

        public int getEmpCode() {
            return empCode;
        }

        public void setEmpCode(int empCode) {
            this.empCode = empCode;
        }

        public String toString() {
            return empCode+"";
        }
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return this.empId + " - " + this.empName;
    }
}
