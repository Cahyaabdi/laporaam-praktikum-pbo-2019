

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class InternshipEmployee1841720070yayak extends Employee1841720070yayak{
    private int length;
    
    public InternshipEmployee1841720070yayak(String name,int length){
        this.length = length;
        this.name = name;
        
    }
    public int getlength(){
        return length;
    }
    public void setlength(int length){
        this.length = length;
        
    }
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info +="Registered as intership employee for "+length+"month/s\n";
        return info;
        }
    }

