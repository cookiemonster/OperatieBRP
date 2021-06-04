Meta:
@status                 Klaar
@regels                 R1853
@sleutelwoorden         Foutief
@usecase                UCS-BY.HG

Narrative:
R1853 Huwelijk en geregistreerd partnerschap, beeindig Geregistreerd Partnerschap in Nederland, actie beeindigingGeregistreerdPartnerschapInNederland

Scenario: R1853 Beeindiging van een geregistreerd partnerschap. Reden einde relatie is niet aanwezig in stamgegeven.
          LT: EGNL01C100T10

Given alle personen zijn verwijderd

Given enkel initiele vulling uit bestand /LO3PL-EGNL/April.xls

Given pas laatste relatie van soort 2 aan tussen persoon 785831241 en persoon 938896969 met relatie id 2000027 en betrokkenheid id 2000028

When voer een bijhouding uit EGNL01C100T10.xml namens partij 'Gemeente BRP 1'

Then heeft het antwoordbericht verwerking Foutief
Then is het antwoordbericht gelijk aan /testcases/bijhouding/EGNL/expected/EGNL01C100T10.xml voor expressie //brp:bhg_hgpRegistreerHuwelijkGeregistreerdPartnerschap_R

Then is in de database de persoon met bsn 785831241 wel als PARTNER betrokken bij een GEREGISTREERD_PARTNERSCHAP