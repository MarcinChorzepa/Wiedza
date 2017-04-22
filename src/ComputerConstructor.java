/**
 * Created by Marcin on 22.04.2017.
 */
public class ComputerConstructor {
    String processor;
    int memory;
    ComputerConstructor(String proc, int mem){
        processor=proc;
        memory=mem;
    }
    void printInfo(){
        System.out.println(processor+" "+memory);
    }
}
