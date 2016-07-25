package com.pantouveris.panagiotis.timokatalogosdikastikwnepimelhtwn;

import java.util.ArrayList;

/**
 * Created by Panagiotis on 20-Nov-15.
 */
public class AreaCollectionData
{

    private ArrayList<AreaCategory> areaCategoryList = new ArrayList<AreaCategory>();
    

    public ArrayList<Area> addArea(ArrayList<Area> areaArrayList, String areaName)
    {
        Area area = new Area(areaName);
        areaArrayList.add(area);

        return areaArrayList;
    }

    //Areas of Attiki to be displayed.
    public ArrayList<AreaCategory> loadSomeData()
    {
        //Zwnh A
        ArrayList<Area> areaArrayList = new ArrayList<Area>();
        addArea(areaArrayList, "Αθήνα");
        addArea(areaArrayList, "Αγία Βαρβάρα");
        addArea(areaArrayList, "Άγιος Δημήτριος");
        addArea(areaArrayList, "Άγιος Ιωάννης Ρέντης");
        addArea(areaArrayList, "Αγία Παρασκευή");
        addArea(areaArrayList, "Αιγάλεω");
        addArea(areaArrayList, "Βύρωνας");
        addArea(areaArrayList, "Γαλάτσι");
        addArea(areaArrayList, "Δάφνη");
        addArea(areaArrayList, "Ζωγράφου");
        addArea(areaArrayList, "Ηλιούπολη");
        addArea(areaArrayList, "Ίλιον");
        addArea(areaArrayList, "Καισαριανή");
        addArea(areaArrayList, "Καλλιθέα");
        addArea(areaArrayList, "Κηπούπολη");
        addArea(areaArrayList, "Κορυδαλλός");
        addArea(areaArrayList, "Μοσχάτο");
        addArea(areaArrayList, "Νέα Ιονία");
        addArea(areaArrayList, "Νέα Σμύρνη");
        addArea(areaArrayList, "Νέα Φιλαδέλφια");
        addArea(areaArrayList, "Νέα Χαλκιδόνα");
        addArea(areaArrayList, "Νέο Ψυχικό");
        addArea(areaArrayList, "Νίκαια");
        addArea(areaArrayList, "Παλατιανή");
        addArea(areaArrayList, "Παπάγου");
        addArea(areaArrayList, "Πειραιάς");
        addArea(areaArrayList, "Περιστέρι");
        addArea(areaArrayList, "Ταύρος");
        addArea(areaArrayList, "Υμηττός");
        addArea(areaArrayList, "Φιλοθέη");
        addArea(areaArrayList, "Χαϊδάρι");
        addArea(areaArrayList, "Χολαργός");
        addArea(areaArrayList, "Ψυχικό");


        AreaCategory areaCategory = new AreaCategory("Ζώνη Α: Συνολικό κόστος 43,05 €", areaArrayList);
        areaCategoryList.add(areaCategory);

        //Zwnh B
        areaArrayList = new ArrayList<Area>();
        addArea(areaArrayList, "Άγιος Κοσμάς");
        addArea(areaArrayList, "Αεροδρόμιο (Σπάτα)");
        addArea(areaArrayList, "Άλιμος");
        addArea(areaArrayList, "Αμαρούσιο");
        addArea(areaArrayList, "Ανθούσα");
        addArea(areaArrayList, "Άνοιξη");
        addArea(areaArrayList, "Άνω Λιόσια");
        addArea(areaArrayList, "Αργυρούπολη");
        addArea(areaArrayList, "Αρτέμιδα (Λούτσα)");
        addArea(areaArrayList, "Ασπρόπυργος");
        addArea(areaArrayList, "Αχαρνές");
        addArea(areaArrayList, "Βάρη");
        addArea(areaArrayList, "Βαρυμπόμπη");
        addArea(areaArrayList, "Βούλα");
        addArea(areaArrayList, "Βουλιαγμένη");
        addArea(areaArrayList, "Βριλήσσια");
        addArea(areaArrayList, "Γέρακας");
        addArea(areaArrayList, "Γλυκά Νερά");
        addArea(areaArrayList, "Γλυφάδα");
        addArea(areaArrayList, "Δαφνί - Χαϊδάρι");
        addArea(areaArrayList, "Δεκέλεια");
        addArea(areaArrayList, "Διόνυσος");
        addArea(areaArrayList, "Δραπετσώνα");
        addArea(areaArrayList, "Δροσιά");
        addArea(areaArrayList, "Εκάλη");
        addArea(areaArrayList, "Ελευσίνα");
        addArea(areaArrayList, "Ελληνικό");
        addArea(areaArrayList, "Ζεφύρι");
        addArea(areaArrayList, "Νέο Ηράκλειο");
        addArea(areaArrayList, "Θρακομακεδόνες");
        addArea(areaArrayList, "Καβούρι (Βουλιαγμένη)");
        addArea(areaArrayList, "Κερατσίνι");
        addArea(areaArrayList, "Κηφισιά");
        addArea(areaArrayList, "Νέα Κηφισιά");
        addArea(areaArrayList, "Κορωπί");
        addArea(areaArrayList, "Κρυονέρι");
        addArea(areaArrayList, "Λουτρόπυργος (Νέα Πέραμος)");
        addArea(areaArrayList, "Λυκόβρυση");
        addArea(areaArrayList, "Μαγούλα");
        addArea(areaArrayList, "Μάνδρα");
        addArea(areaArrayList, "Μάτι (Νέα Μάκρη)");
        addArea(areaArrayList, "Μελίσσια");
        addArea(areaArrayList, "Μεταμόργωση");
        addArea(areaArrayList, "Νέα Ερυθραία");
        addArea(areaArrayList, "Ντάου Πεντέλης (Πεντέλη)");
        addArea(areaArrayList, "Ντράφι (Πικέρμι)");
        addArea(areaArrayList, "Παιανία");
        addArea(areaArrayList, "Παλαιό Φάληρο");
        addArea(areaArrayList, "Πεντέλη");
        addArea(areaArrayList, "Πέραμα");
        addArea(areaArrayList, "Πετρούπολη");
        addArea(areaArrayList, "Πεύκη");
        addArea(areaArrayList, "Πικέρμι");
        addArea(areaArrayList, "Ραφήνα");
        addArea(areaArrayList, "Ροδόπολη");
        addArea(areaArrayList, "Σκαραμαγκάς");
        addArea(areaArrayList, "Σπάτα");
        addArea(areaArrayList, "Σταμάτα");
        addArea(areaArrayList, "Σταυρός");
        addArea(areaArrayList, "Τατόι");
        addArea(areaArrayList, "Φυλή");
        addArea(areaArrayList, "Χαλάνδρι");

        areaCategory = new AreaCategory("Ζώνη B: Συνολικό κόστος 67,65 €", areaArrayList);
        areaCategoryList.add(areaCategory);

        //Zwnh Γ
        areaArrayList = new ArrayList<Area>();
        addArea(areaArrayList, "Άγιοι Απόστολλοι");
        addArea(areaArrayList, "Άγιος Κοσμάς (Λαύριο)");
        addArea(areaArrayList, "Αγία Μαρίνα - Κορωπί");
        addArea(areaArrayList, "Αγία Μαρίνα - Νέα Μάκρη");
        addArea(areaArrayList, "Άγιος Σωτήρας (Μάνδρα)");
        addArea(areaArrayList, "Ανάβυσσος");
        addArea(areaArrayList, "Αυλάκι (Μαρκόπουλο)");
        addArea(areaArrayList, "Αυλώνα");
        addArea(areaArrayList, "Αφίδνες");
        addArea(areaArrayList, "Βάρκιζα (Βάρη)");
        addArea(areaArrayList, "Βαρνάβα");
        addArea(areaArrayList, "Βίλλια");
        addArea(areaArrayList, "Γραμματικό");
        addArea(areaArrayList, "Δασκαλειό (Κερατέα)");
        addArea(areaArrayList, "Ζούμπερι (Νέα Μάκρη)");
        addArea(areaArrayList, "Θυμάρι (Παλαιά Φώκαια)");
        addArea(areaArrayList, "Κάζα (Μάνδρα)");
        addArea(areaArrayList, "Κάλαμος");
        addArea(areaArrayList, "Καλύβια (Θορυκού)");
        addArea(areaArrayList, "Καπανδρίτι");
        addArea(areaArrayList, "Καραούλι (Μάνδρα)");
        addArea(areaArrayList, "Κερατέα");
        addArea(areaArrayList, "Κινέτα (Μέγαρα)");
        addArea(areaArrayList, "Κουβαράς");
        addArea(areaArrayList, "Λαγονήσι (Καλύβια Θορικού)");
        addArea(areaArrayList, "Λαύριο");
        addArea(areaArrayList, "Λεγραινά");
        addArea(areaArrayList, "Μαλακάσα");
        addArea(areaArrayList, "Μαραθώνας");
        addArea(areaArrayList, "Μαρκώπουλο Μεσογαίας");
        addArea(areaArrayList, "Μαρκόπουλο Ωροπού");
        addArea(areaArrayList, "Μέγαρα");
        addArea(areaArrayList, "Μήλεσι Ωροπού");
        addArea(areaArrayList, "Νέα Μάκρη");
        addArea(areaArrayList, "Νέα Πέραμος (Μεγάλο Πεύκο)");
        addArea(areaArrayList, "Νεράκι (Νέα Πέραμος)");
        addArea(areaArrayList, "Οινόη");
        addArea(areaArrayList, "Παλαιά Φώκαια");
        addArea(areaArrayList, "Πάρνηθα (Θρακομακεδόνες)");
        addArea(areaArrayList, "Πάχη");
        addArea(areaArrayList, "Πλάκα - Λαύριο");
        addArea(areaArrayList, "Πολυδένδρι");
        addArea(areaArrayList, "Πόρτπ Ράφτη");
        addArea(areaArrayList, "Σαρωνίδα");
        addArea(areaArrayList, "Σκάλα Ωροπού");
        addArea(areaArrayList, "Σούλι Μαραθώνα");
        addArea(areaArrayList, "Σούνιο Μεσογειακώς");
        addArea(areaArrayList, "Συκάμινο");
        addArea(areaArrayList, "Σχοινιάς Μαραθώνα");
        addArea(areaArrayList, "Χαλκούτσι");
        addArea(areaArrayList, "Ωροπός");
        areaCategory = new AreaCategory("Ζώνη Γ: Συνολικό κόστος 89,79 €", areaArrayList);
        areaCategoryList.add(areaCategory);

        return areaCategoryList;
    }
}
