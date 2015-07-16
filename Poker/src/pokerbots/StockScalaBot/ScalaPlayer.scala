package pokerbots.StockScalaBot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

class ScalaPlayer(output: PrintWriter, input: BufferedReader) {
  
    def run() = {
    
      try {
        do {
          var inputString: String = input.readLine()
          println(inputString)
          
          var word: String = inputString.split(" ")(0)
          
          word match {
            case "GETACTION" => output.println("CHECK")
            case "REQUESTKEYVALUES" => output.println("FINISH")
          }
          
          
        } while ((input.readLine()) != null)
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