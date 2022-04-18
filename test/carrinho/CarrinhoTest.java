package carrinho;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;
import produto.Produto;
import produto.ProdutoNaoEncontradoException;


class CarrinhoTest {

	 Carrinho car = new Carrinho();
	    private ArrayList<Produto> itemsCar = new ArrayList<Produto>();
	   
	    @Test
	    public void testGetValorTotal(){		
	        Produto prod1 = new Produto("Chocolate", 10.00);
	        Produto prod2 = new Produto("Cenoura", 2.00);
	        car.addItem(prod1);
	        car.addItem(prod2);
	        assertEquals(12.00, car.getValorTotal());
	    }
	    
	    @Test
	    public void testAddItem(){
	        Produto prod1 = new Produto("Bombom", 6.99);
	        car.addItem(prod1);
	        itemsCar.add(prod1);
	        assertArrayEquals(itemsCar.toArray(), car.returnItems().toArray());
	        
	    }
	    
	    @Test
	    public void testRemoveItem() throws ProdutoNaoEncontradoException{
	        Produto prod1 = new Produto("Bombom", 6.99);
	        car.addItem(prod1);
	        car.removeItem(prod1);
	        assertArrayEquals(itemsCar.toArray(), car.returnItems().toArray());
	    }
	    
	    @Test
	    public void testGetQtdeItems(){
	        Produto prod1 = new Produto("Chocolate", 10.00);
	        Produto prod2 = new Produto("Cenoura", 2.00);
	        car.addItem(prod1);
	        car.addItem(prod2);
	        assertEquals(2, car.getQtdeItems());
	    }    
	    
	    @Test
	    public void testEsvazia(){
	        Produto prod1 = new Produto("Chocolate", 10.00);
	        Produto prod2 = new Produto("Cenoura", 2.00);
	        car.addItem(prod1);
	        car.addItem(prod2);
	        car.esvazia();
	        assertEquals(0, car.getQtdeItems());
	    }

}
