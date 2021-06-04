Meta:
@status                 Klaar
@regels                 R2163
@sleutelwoorden         voltrekkingHuwelijkInNederland VHNL02C680T30
@usecase                UCS-BY.HG

Narrative:
R2163 Personen Libby Thatcher (Ingeschrevene-Ingezetene, Niet NL Nat) en Piet Jansen (Ingeschrevene-Ingezetene, NL Nat) gaan trouwen, adelijke en predicaat gevuld

Scenario:   Predicaat en Adelijke titel beiden gevuld
            LT: VHNL02C680T30



Given alle personen zijn verwijderd
Given enkel initiele vulling uit bestand /LO3PL/VHNL02_reg_gesl_nm-Libby.xls
Given enkel initiele vulling uit bestand /LO3PL/VHNL02_reg_gesl_nm-Piet.xls

When voer een bijhouding uit VHNL02C680T30.xml namens partij 'Gemeente BRP 1'

Then heeft het antwoordbericht verwerking Foutief
Then is het antwoordbericht gelijk aan /testcases/bijhouding/VHNL/expected/VHNL02C680T30.xml voor expressie //brp:bhg_hgpRegistreerHuwelijkGeregistreerdPartnerschap_R

Then is in de database de persoon met bsn 690020041 niet als PARTNER betrokken bij een HUWELIJK
Then is in de database de persoon met bsn 373230217 niet als PARTNER betrokken bij een HUWELIJK

Then lees persoon met anummer 8240349473 uit database en vergelijk met expected VHNL02C680T30-persoon1.xml
Then lees persoon met anummer 9543058721 uit database en vergelijk met expected VHNL02C680T30-persoon2.xml






