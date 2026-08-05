flowchart LR

%% START
Start((Customer Order))

%% PRODUCTION MANAGER
subgraph PM["Production Manager"]
PO["Create Production Order"]
end


%% MES SYSTEM
subgraph MES["MES System"]
Lots["Generate Wafer Lots"]
Route["Assign Manufacturing Route"]
Assign["Assign Equipment"]
end


%% PRODUCTION OPERATOR
subgraph Operator["Production Operator"]

    StartProd["Start Production"]

    Cleaning["Cleaning & Oxidation"]

    Photo["Photoresist Coating"]

    Lithography["Photolithography"]

    Etching["Etching"]

    Doping["Ion Implantation"]

    Layers{"All Layers Completed?"}

end


%% QUALITY
subgraph QE["Quality Engineer"]

    QC["Quality Inspection"]

    Passed{"Inspection Passed?"}

end

%% END
Shipment["Prepare Shipment"]

End((Order Completed))

%% ===========================
%% MAIN FLOW
%% ===========================

Start --> PO

PO --> Lots

Lots --> Route

Route --> Assign

Assign --> StartProd

StartProd --> Cleaning

Cleaning --> Photo

Photo --> Lithography

Lithography --> Etching

Etching --> Doping

Doping --> Layers

Layers -->|No| Cleaning

Layers -->|Yes| QC

QC --> Passed

Passed -->|No| Cleaning

Passed -->|Yes| Shipment

Shipment --> End

%% ===========================
%% COLORS
%% ===========================

style Start fill:#C8E6C9,stroke:#2E7D32,stroke-width:2px
style End fill:#C8E6C9,stroke:#2E7D32,stroke-width:2px

style Layers fill:#FFF3CD,stroke:#B8860B
style Passed fill:#FFF3CD,stroke:#B8860B

style PO fill:#BBDEFB
style Lots fill:#BBDEFB
style Route fill:#BBDEFB
style Assign fill:#BBDEFB

style StartProd fill:#E1F5FE
style Cleaning fill:#E1F5FE
style Photo fill:#E1F5FE
style Lithography fill:#E1F5FE
style Etching fill:#E1F5FE
style Doping fill:#E1F5FE

style QC fill:#FFE0B2

style Shipment fill:#EDE7F6