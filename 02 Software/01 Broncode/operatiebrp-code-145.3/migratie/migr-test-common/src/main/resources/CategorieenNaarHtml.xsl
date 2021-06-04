<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="categorieen">
		<html>
			<head>
				<title>
					Foutmelding
				</title>
	<style>
	<![CDATA[
	body {
		font-family:
		Trebuchet
		MS, Helvetica,
		sans-serif;
		background-color: White;
		font-size: 16px;
	}			
	a {
		color: #154273; 
	}
	table {
		margin: 0 auto;
	
		border-collapse: collapse;
		border: 1px solid
		#222222;
		white-space: nowrap;
	}
	th {
		background-color: #046F96;
		color:
		white;
	}
	th,td {
		text-align: left;
		border: 1px solid
		#222222;
		padding:
		5px;
		text-align: left;
	}
	tr {
		height: 24px;
	}
				
]]>
	</style>
			</head>
			<body>
				<table>
					<col width="150px" />
					<col width="50px" />
					<col width="50px" />
					<col width="150px" />
					<col/>
					<thead>
						<th>Categorie</th>
						<th>Stapel</th>
						<th>Voorkomen</th>
						<th>Element</th>
						<th>Waarde</th>
					</thead>
					<tbody>
						<xsl:for-each select="categorie/element">
							<tr>
								<td><xsl:value-of select="../@categorie" /></td>
								<td><xsl:value-of select="../@stapel" /></td>
								<td><xsl:value-of select="../@voorkomen" /></td>
								<td><xsl:value-of select="@element" /></td>
								<td><xsl:value-of select="@waarde" /></td>
							</tr>
						</xsl:for-each>
					</tbody>
				</table>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>