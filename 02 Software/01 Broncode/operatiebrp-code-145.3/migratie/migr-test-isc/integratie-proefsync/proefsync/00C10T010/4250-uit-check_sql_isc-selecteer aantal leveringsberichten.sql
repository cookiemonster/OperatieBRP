select count(*) as aantal from mig_bericht mb, mig_bericht mbb where mb.virtueel_proces_id = mbb.virtueel_proces_id and mb.kanaal = 'Levering' and mbb.kanaal = 'VOISC' and mbb.richting = 'U' and mb.naam = 'Levering'