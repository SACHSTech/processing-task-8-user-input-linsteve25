import processing.core.PApplet;
public class Sketch extends PApplet {

  // Initialize variables

  boolean blnUpPressed = false;
  boolean blnDownPressed = false;
  boolean blnLeftPressed = false;
  boolean blnRightPressed = false;

  float fltCircleX = 150;
  float fltCircleY = 150;


  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(0);
  }

  public void draw() {

    // use the keyPressed variable to tell if a key is pressed
    if (keyPressed) {
      
      // use key variable to change the background color if the key "i" is pressed
      if (key == 'i') {
        background(67, 89, 180);
      }
      // use key variable to change the background color if the key "o" is pressed
      else if (key == 'o') {
        background(50, 145, 200);
      }
      // use key variable to change the background color if the key "p" is pressed
      else if (key == 'p') {
        background(200, 78, 24);
      }
      // if another key is pressed, the background changes to red
      else {
        background(255, 0, 0);
      }
    }
    
    // uses the mousePressed variable and the mouseX and mouseY variable to print circles at the cursor location when pressed
    if (mousePressed) {
      fill(247, 175, 17);
      ellipse(mouseX, mouseY, 25, 25);
    }

    // if the the boolean is true, the circle will move in the direction of the arrow key pressed
    if (blnUpPressed) {
      fltCircleY--;
    }
    if (blnDownPressed) {
      fltCircleY++;
    }
    if (blnLeftPressed) {
      fltCircleX--;
    }
    if (blnRightPressed) {
      fltCircleX++;
    }

    fill(0, 80, 24);
    ellipse(fltCircleX, fltCircleY, 50, 50);
	  
  }

  // draws a rectangle when the mouse wheel is moved using the mouseWheel function
  public void mouseWheel() {
    fill(0, 255, 0);
    rect(mouseX, mouseY, 60, 20);
  }
  
  // draws a square when the mouse is released using the mouseReleased function
  public void mouseReleased() {
    fill(0, 0, 255);
    rect(mouseX, mouseY, 50, 50);
  }

  // if statement that is excecuted when an arrow key is pressed, which changes the boolean to true
  public void keyPressed() {
    if (keyCode == UP) {
      blnUpPressed = true;
    }
    else if (keyCode == DOWN) {
      blnDownPressed = true;
    }
    else if (keyCode == LEFT) {
      blnLeftPressed = true;
    }
    else if (keyCode == RIGHT) {
      blnRightPressed = true;
    }
  }

  // if statment is excecuted when the arrow key is released, which changes the boolean to false
  public void keyReleased() {
    if (keyCode == UP) {
      blnUpPressed = false;
    }
    else if (keyCode == DOWN) {
      blnDownPressed = false;
    }
    else if (keyCode == LEFT) {
      blnLeftPressed = false;
    }
    else if (keyCode == RIGHT) {
      blnRightPressed = false;
    }
  }

}
