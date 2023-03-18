import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
       List<Person> people = generateClients();
        Queue<Person> attraction = new LinkedList<>(people);

        while (!attraction.isEmpty()){
            Person person = attraction.poll();
            int countTickets = person.getTickets();
            countTickets = countTickets -1;
            person.setTickets(countTickets);
            System.out.printf("\n %s %s прокатился(ась) на атракционе. Осталось %d билетов." +
                    "", person.getName(), person.getSurName(), person.getTickets());
            if (countTickets != 0){
                attraction.offer(person);
            }
        }
    }
       private static List<Person> generateClients(){
        return List.of(
                new Person("Vasya","Pupkin",2),
           new Person("Phedya","Nosov",3),
           new Person("Olya","Petrova",1),
           new Person("Georgy","Jukov",4),
           new Person("Jules","Verne",5)
                );

    }
}