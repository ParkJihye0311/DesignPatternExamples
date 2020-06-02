class SLEEP implements State{
  public void on_button(Light light){
      light.setState( new ON() );
      }
  public void off_button(Light light){
      light.setState(new OFF() );
      }
   }
