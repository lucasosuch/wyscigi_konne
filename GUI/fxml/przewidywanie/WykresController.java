package wyscigi_konne.GUI.fxml.przewidywanie;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

public class WykresController implements Initializable {

    @FXML PieChart wykres;
   
    ObservableList<Data> dane = FXCollections.observableArrayList();
    static ObservableList<ElementyTabeli> daneDoWykresu = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb){ 
 
        int i;
        for(i=0;i<daneDoWykresu.size();i++){
            
            dane.add(new PieChart.Data("" + daneDoWykresu.get(i).getKon() + " " + daneDoWykresu.get(i).getJezdziec(),4.5));
        }
 
        wykres.setLegendSide(Side.RIGHT);
        wykres.setData(dane);
    }  

    public static void setDane(ObservableList<ElementyTabeli> daneTabeli) {
        daneDoWykresu = daneTabeli;
    }


}    
    

