package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

  @Test
  void fire_Success(){
    // Arrange
    TorpedoStore store = new TorpedoStore(1);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(true, result);
  }

  @Test
  void fire_Invalid(){
    // Arrange
    TorpedoStore store = new TorpedoStore(0);
    boolean catched = false;
    // Act
    try{
      boolean result = store.fire(1);
    }
    catch(IllegalArgumentException ex){
      catched = true;
    }
    
    // Assert
    assertEquals(true, catched);
  }

  @Test
  void store_empty(){
    //Arrange
    TorpedoStore store = new TorpedoStore(0);

    //Act
    boolean result = store.isEmpty();

    //Assert
    assertEquals(true, result);
  }

  @Test
  void store_TorpedoCount(){
        //Arrange
        TorpedoStore store = new TorpedoStore(7);

        //Act
        int result = store.getTorpedoCount();
    
        //Assert
        assertEquals(7, result);
  }
}
