select a.srt,a.admhnd,lo3ber,lo3categorie,lo3stapelvolgnr,lo3voorkomenvolgnr,lo3conversiesortering,sa.naam from kern.actie a left join verconv.lo3voorkomen v on a.id=v.actie left join kern.srtactie sa on a.srt=sa.id order by lo3categorie