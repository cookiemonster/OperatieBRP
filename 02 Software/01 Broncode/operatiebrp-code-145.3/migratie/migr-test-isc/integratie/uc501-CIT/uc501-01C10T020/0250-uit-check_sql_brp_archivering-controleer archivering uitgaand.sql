select count(*) as uitgaand from ber.ber where srt = 161 and richting = 2 and zendendepartij = 2001 and ontvangendepartij = $$partijid$$;