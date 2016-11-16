package classes;

import java.awt.datatransfer.StringSelection;

/**
 * Created by JPMPC-B208 on 11/10/2016.
 */
public class Employee extends Person {
    public int empid;
    public String department;
    public int sss;
    public int pagibig;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSss() {
        return sss;
    }

    public void setSss(int sss) {
        this.sss = sss;
    }

    public int getPagibig() {
        return pagibig;
    }

    public void setPagibig(int pagibig) {
        this.pagibig = pagibig;
    }
}
