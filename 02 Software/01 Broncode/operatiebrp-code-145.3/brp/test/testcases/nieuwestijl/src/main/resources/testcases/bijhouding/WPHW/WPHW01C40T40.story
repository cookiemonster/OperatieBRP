Meta:
@status                 Klaar
@usecase                UCS-BY.HG

Narrative: R2739 Waarschuwing Naamswijziging pseudo (ex)partner werkt niet door in Naamgebruik hoofdpersoon

Scenario:   Pseudo-partner wijzigt Samengestelde naam. Hoofdpersoon Naamgebruik afgeleid Ja en geen Eigen naamgebruik
            LT: WPHW01C40T40

Given alle personen zijn verwijderd

!-- Vulling van de hoofdpersoon met een ontbonden huwelijk
Given enkel initiele vulling uit bestand /LO3PL-WPHW/WPHW01C40T40-001.xls

Then heeft $HOOFD_BSN$ de waarde van de volgende query: select bsn from kern.pers where voornamen = 'Hoofdpersoon'
Then heeft $EX_BSN$ de waarde van de volgende query: select bsn from kern.pers where voornamen = 'Ex'

Given de database is aangepast met: update kern.his_persnaamgebruik
                                    set    indnaamgebruikafgeleid=true
				    where  pers in (select id from kern.pers where voornamen='Hoofdpersoon')

!-- Zet de technische sleutel van de relatie en de betrokkenheid van de ex-partner
Given pas laatste relatie van soort 1 aan tussen persoon 175346161 en persoon 848612553 met relatie id 50000001 en betrokkenheid id 50000001

!-- Zet de technische sleutel van de relatie en de betrokkenheid van de hoofdpersoon
Given pas laatste relatie van soort 1 aan tussen persoon 848612553 en persoon 175346161 met relatie id 50000002 en betrokkenheid id 50000002

!-- Wijziging partnergegevens huwelijk
When voer een bijhouding uit WPHW01C40T40.xml namens partij 'Gemeente BRP 1'

Then heeft het antwoordbericht verwerking Geslaagd
Then is het antwoordbericht gelijk aan /testcases/bijhouding/WPHW/expected/WPHW01C40T40.xml voor expressie /