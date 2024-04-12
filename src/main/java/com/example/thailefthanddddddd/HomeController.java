package com.example.thailefthanddddddd;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class HomeController {
    public TableView<NhanVien> tableView;
    public AnchorPane nhanvien;
    public AnchorPane trangchu;
    public static ObservableList<NhanVien> data = FXCollections.observableArrayList();
    public TextField manv;
    public TextField mail;
    public TextField sdt;
    public TextField tuoi;
    public TextField ten;

    public void initialize(){
        tableView.setItems(data);
        String filename = "data.txt";
        try (Reader reader = new FileReader(filename)) {
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                String[] data2 = line.split("\\|"); // Split using pipe delimiter
                NhanVien nv = new NhanVien(data2[0],data2[1],Integer.parseInt( data2[2]),data2[3],data2[4]);



                data.add(nv);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void home(ActionEvent actionEvent) {
        show(trangchu);
    }

    public void staff(ActionEvent actionEvent) {
        show(nhanvien);
    }

    public void salary(ActionEvent actionEvent) {
    }

    public void schedule(ActionEvent actionEvent) {
    }


    private void show(AnchorPane paneToShow) {
        List<AnchorPane> allPanes = Arrays.asList(trangchu, nhanvien);
        for (AnchorPane pane : allPanes) {
            if (pane != paneToShow) {
                pane.setVisible(false);
            } else {
                pane.setVisible(true);
            }
        }
    }

    public void addData(ActionEvent actionEvent) {
        data.add(new NhanVien(manv.getText(),ten.getText(), Integer.parseInt(tuoi.getText()),sdt.getText(),mail.getText()));
        writeFile(data,"data.txt");
    }

    public void removeData(ActionEvent actionEvent) {
        data.remove(tableView.getSelectionModel().getSelectedItem());
        writeFile(data,"data.txt");

    }
    public void editData(TableColumn.CellEditEvent<NhanVien, String> event) {
        NhanVien nv = tableView.getSelectionModel().getSelectedItem();
        if (nv != null) {
            nv.setManv(event.getNewValue());
            writeFile(data, "data.txt");
        }
    }



    public static void writeFile(List<NhanVien> nhanViens, String filename) {
        try (Writer writer = new FileWriter(filename)) {
            String dataa = "";
            for(NhanVien nv : nhanViens)
            {
                 dataa += nv.getManv() + "|" + nv.getHoten() + "|" +nv.getTuoi() + "|" +nv.getSdt() + "|" +nv.getMail() + "\n";
            }
            writer.write(dataa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
