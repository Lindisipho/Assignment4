import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TruckTest {
    private Truck[] truckArray;
    private List<Truck> truckList;
    private Set<Truck> truckSet;
    private Map<String, Truck> truckMap;
    private Collection<Truck> truckCollection;

    @Before
    public void setUp() throws Exception {

        truckArray = new Truck[3];
        truckArray[0] = new Truck("MAN", 2007, 12);
        truckArray[1] = new Truck("SCANIA", 2019, 13);
        truckArray[2] = new Truck("MERCEDES", 2015, 14);

        //List
        truckList = new ArrayList<>();
        truckList.add(truckArray[0]);
        truckList.add(truckArray[1]);
        truckList.add(truckArray[2]);

        //Set
        truckSet = new HashSet<>();
        truckSet.add(truckArray[0]);
        truckSet.add(truckArray[1]);
        truckSet.add(truckArray[2]);

        //Map
        truckMap = new HashMap<>();
        truckMap.put("1", truckArray[0]);
        truckMap.put("2", truckArray[1]);
        truckMap.put("3", truckArray[2]);

        //Collection
        truckCollection = new LinkedList<>();
        truckCollection.add(truckArray[0]);
        truckCollection.add(truckArray[1]);
        truckCollection.add(truckArray[2]);

    }

    @Test
    public void list() {
        assertEquals(truckList.size(), 3);
    }

    @Test
    public void set() {
        assertFalse(truckSet.contains(new Truck("RANUELT", 2010, 15)));
    }

    @Test
    public void map() {
        assertSame(truckMap.get("1"), truckArray[0]);
    }

    @Test
    public void collection() {
        assertTrue(truckCollection.contains(truckArray[2]));
    }

}