/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimplement;
import java.util.List;
import model.*;
/**
 *
 * @author Lab Informatika
 */
public interface data_implement {
    public void insert(datapenitipan dp); 
    public void update(datapenitipan dp); 
    public void delete(datapenitipan dp); 
    public List<datapenitipan>getAll(); 
}
