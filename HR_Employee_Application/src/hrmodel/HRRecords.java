/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrmodel;

import java.util.ArrayList;

/**
 *
 * @author varun
 */
public class HRRecords {
    
    private ArrayList<HRData> records;

    public HRRecords() {
        this.records = new ArrayList<HRData>();
    }

    public ArrayList<HRData> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<HRData> records) {
        this.records = records;
    }
    
    public  HRData  addNewRecord(){
    
    HRData newRecords = new HRData();
    records.add(newRecords);
    return newRecords;
}
    
    public void deleteRecord(HRData record){
        
        records.remove(record);
        
        
    }
    
    
}
