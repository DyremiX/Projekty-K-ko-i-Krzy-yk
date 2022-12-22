//package pk.projekt.springboot.DAO;
//
//import org.springframework.stereotype.Repository;
//import pk.projekt.springboot.MODEL.Person;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//@Repository("FakeDao")
//public class FakePersonDataAccessService implements PersonDao {
//
//    private static List<Person> DB = new ArrayList<>();
//    @Override
//    public int insertPerson(UUID id, Person person) {
//        DB.add(new Person(id, person.getName()));
//        return 0;
//    }
//
//    @Override
//    public List<Person> selectAllPeople() {
//        return DB;
//    }
//
//
//}
