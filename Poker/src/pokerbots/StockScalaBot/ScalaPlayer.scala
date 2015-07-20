package pokerbots.StockScalaBot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import pokerbots.Interfaces.Player

class ScalaPlayer(output: PrintWriter, input: BufferedReader) extends Player {
  
    def run() = {
    
      try {
        
        var line: String = ""
        
        while ({ var line = input.readLine() ; line != null} )
          println(line)
          
          var word: String = line.split(" ")(0)
          
          word match {
            case "GETACTION" => output.println("CHECK")
            case "REQUESTKEYVALUES" => output.println("FINISH")
          }
      } catch {
        case e: IOException => println("IOException: " + e.getMessage)
      }
        
      try {
        output.close()
        input.close()
      } catch {
        case e: IOException => {
          println("Encounterd problem shutting down connections")
          e.printStackTrace()
        }
      }
    }
}