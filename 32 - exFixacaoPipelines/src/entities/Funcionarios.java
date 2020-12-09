/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Antonio
 */
public class Funcionarios {
    private String name;
    private Double salary;
    private String email;

    public Funcionarios(String name, Double salary, String email) {
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
	public String toString() {
		return "Funcionary ["+name + ", " + email + ", "+salary+"]";
	}
}
