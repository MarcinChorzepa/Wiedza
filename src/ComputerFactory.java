/**
 * Created by Marcin on 22.04.2017.
 */
public class ComputerFactory {
    Computer create(String processor,int memory){
        Computer computer=new Computer();
        computer.processor=processor;
        computer.memory=memory;
        return computer;
    }
}
