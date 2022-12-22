//package pk.projekt.springboot.SERVICE;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//import pk.projekt.springboot.DAO.PersonDao;
//import pk.projekt.springboot.MODEL.Person;
//
//import java.util.List;
//import java.util.UUID;
//@Service
//public class PersonService {
//    private final PersonDao personDao;
//    @Autowired
//    public PersonService(@Qualifier("FakeDao") PersonDao personDao) {
//        this.personDao = personDao;
//    }
//
//    public int addPerson(Person person){
//        return personDao.insertPerson(person);
//    }
//
//    public List<Person> getAllPeople(){
//        return personDao.selectAllPeople();
//    }
//}
