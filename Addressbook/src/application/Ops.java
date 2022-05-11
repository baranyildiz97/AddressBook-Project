//151805042 BARAN YILDIZ

package application;

import java.io.File;
import java.io.IOException;

// Adding and updating database
public interface Ops {
public void addDatabase(int id,String name,String street,String city,String gender,String zip,File file) throws IOException;
public void updateDatabase(int id,File file,String [] update)throws IOException;
}
