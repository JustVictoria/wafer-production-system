%% diagram procesu produkcji
graph LR
Start([Zamówienie]) --> Receive["Zebranie zamówienia do produkcji<br/> customer Id"]
Receive --> Division["Podział na partie<br/>25pices"]
Division --> Loading["Do procesu produkcji"]

    Loading --> Clean[" Czyszczenie i Utlenianie "]
    Clean --> Photoresist[" Naniesienie Fotorezystu"]
    Photoresist --> Lithography[" Naświetlanie<br/>fotolitografia EUV/DUV"]
    Lithography --> Etching[" Trawienie "]
    Etching --> Doping["Implantacja Jonów<br/>Bombardowanie jonami CVD/PVD"]
    
    Doping --> Decision1{Wszystkie warstwy<br/>nałożone?}
    Decision1 -->|NIE| Clean
    Decision1 -->|TAK| QC["Kontrola Jakości<br/>Testy temperatury i wydajności"]
    
    QC --> Decision2{Próba<br/>zdana?}
    Decision2 -->|NIE| Reprocess[" Przetworzenie<br/>Ponowne uruchomienie cyklu"]
    Reprocess --> Clean
    Decision2 -->|TAK| Shipment[" Wysyłka<br/>Przesłanie do klienta"]
    Shipment --> End([Koniec procesu])
    
    style Start fill:#e1f5e1
    style End fill:#ffe1e1
    style Decision1 fill:#fff4e1
    style Decision2 fill:#fff4e1
    style Receive fill:#e3f2fd
    style MES fill:#e3f2fd
    style Loading fill:#e0f2f1
    style Clean fill:#e3f2fd
    style Photoresist fill:#e3f2fd
    style Lithography fill:#e3f2fd
    style Etching fill:#e3f2fd
    style Doping fill:#e3f2fd
    style QC fill:#fff4e1
    style Shipment fill:#f3e5f5
