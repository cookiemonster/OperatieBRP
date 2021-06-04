/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at https://github.com/MinBZK/operatieBRP.
 */

package nl.bzk.migratiebrp.isc.jbpm.uc1003.verwijderen;

import java.util.HashMap;
import java.util.Map;
import nl.bzk.migratiebrp.bericht.model.lo3.Lo3HeaderVeld;
import nl.bzk.migratiebrp.bericht.model.lo3.impl.Af11Bericht;
import nl.bzk.migratiebrp.bericht.model.lo3.impl.Av01Bericht;
import nl.bzk.migratiebrp.isc.jbpm.common.berichten.BerichtenDao;
import nl.bzk.migratiebrp.isc.jbpm.common.berichten.InMemoryBerichtenDao;
import nl.bzk.migratiebrp.isc.jbpm.uc1003.AfnemersIndicatieJbpmConstants;
import org.junit.Assert;
import org.junit.Test;

public class MaakAf11BerichtActionTest {

    private static final String A_NUMMER = "1234567890";

    private BerichtenDao berichtenDao = new InMemoryBerichtenDao();
    private MaakAf11BerichtAction subject = new MaakAf11BerichtAction(berichtenDao);

    @Test
    public void testFoutredenX() {
        final Av01Bericht av01Bericht = VerwijderenAfnIndTestUtil.maakAv01Bericht("059901", A_NUMMER);

        final Map<String, Object> parameters = new HashMap<>();
        parameters.put(AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_KEY, AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_X);

        parameters.put("input", berichtenDao.bewaarBericht(av01Bericht));

        final Map<String, Object> result = subject.execute(parameters);
        Assert.assertEquals(1, result.size());

        final Af11Bericht af11Bericht = (Af11Bericht) berichtenDao.leesBericht((Long) result.get("af11Bericht"));

        Assert.assertNotNull(af11Bericht);
        Assert.assertEquals(av01Bericht.getANummer(), af11Bericht.getANummer());
        Assert.assertEquals(av01Bericht.getDoelPartijCode(), af11Bericht.getBronPartijCode());
        Assert.assertEquals(av01Bericht.getBronPartijCode(), af11Bericht.getDoelPartijCode());

        Assert.assertEquals(av01Bericht.getMessageId(), af11Bericht.getCorrelationId());
        Assert.assertNotNull(af11Bericht.getMessageId());

        Assert.assertEquals(AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_X, af11Bericht.getHeaderWaarde(Lo3HeaderVeld.FOUTREDEN));
        Assert.assertEquals("0000", af11Bericht.getHeaderWaarde(Lo3HeaderVeld.GEMEENTE));
        Assert.assertEquals("0000000000", af11Bericht.getHeaderWaarde(Lo3HeaderVeld.A_NUMMER));
    }

    @Test
    public void testFoutredenG() {
        final Av01Bericht av01Bericht = VerwijderenAfnIndTestUtil.maakAv01Bericht("059901", A_NUMMER);

        final Map<String, Object> parameters = new HashMap<>();
        parameters.put(AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_KEY, AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_G);

        parameters.put("input", berichtenDao.bewaarBericht(av01Bericht));

        final Map<String, Object> result = subject.execute(parameters);
        Assert.assertEquals(1, result.size());

        final Af11Bericht af11Bericht = (Af11Bericht) berichtenDao.leesBericht((Long) result.get("af11Bericht"));

        Assert.assertNotNull(af11Bericht);
        Assert.assertEquals(av01Bericht.getANummer(), af11Bericht.getANummer());
        Assert.assertEquals(av01Bericht.getDoelPartijCode(), af11Bericht.getBronPartijCode());
        Assert.assertEquals(av01Bericht.getBronPartijCode(), af11Bericht.getDoelPartijCode());

        Assert.assertEquals(av01Bericht.getMessageId(), af11Bericht.getCorrelationId());
        Assert.assertNotNull(af11Bericht.getMessageId());

        Assert.assertEquals(AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_G, af11Bericht.getHeaderWaarde(Lo3HeaderVeld.FOUTREDEN));
        Assert.assertEquals("0000", af11Bericht.getHeaderWaarde(Lo3HeaderVeld.GEMEENTE));
        Assert.assertEquals("0000000000", af11Bericht.getHeaderWaarde(Lo3HeaderVeld.A_NUMMER));
    }

    @Test
    public void testFoutredenU() {
        final Av01Bericht av01Bericht = VerwijderenAfnIndTestUtil.maakAv01Bericht("059901", A_NUMMER);

        final Map<String, Object> parameters = new HashMap<>();
        parameters.put(AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_KEY, AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_U);

        parameters.put("input", berichtenDao.bewaarBericht(av01Bericht));

        final Map<String, Object> result = subject.execute(parameters);
        Assert.assertEquals(1, result.size());

        final Af11Bericht af11Bericht = (Af11Bericht) berichtenDao.leesBericht((Long) result.get("af11Bericht"));

        Assert.assertNotNull(af11Bericht);
        Assert.assertEquals(av01Bericht.getANummer(), af11Bericht.getANummer());
        Assert.assertEquals(av01Bericht.getDoelPartijCode(), af11Bericht.getBronPartijCode());
        Assert.assertEquals(av01Bericht.getBronPartijCode(), af11Bericht.getDoelPartijCode());

        Assert.assertEquals(av01Bericht.getMessageId(), af11Bericht.getCorrelationId());
        Assert.assertNotNull(af11Bericht.getMessageId());

        Assert.assertEquals(AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_U, af11Bericht.getHeaderWaarde(Lo3HeaderVeld.FOUTREDEN));
        Assert.assertEquals("0000", af11Bericht.getHeaderWaarde(Lo3HeaderVeld.GEMEENTE));
        Assert.assertEquals("0000000000", af11Bericht.getHeaderWaarde(Lo3HeaderVeld.A_NUMMER));
    }

    @Test
    public void testFoutredenI() {
        final Av01Bericht av01Bericht = VerwijderenAfnIndTestUtil.maakAv01Bericht("059901", A_NUMMER);

        final Map<String, Object> parameters = new HashMap<>();
        parameters.put(AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_KEY, AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_I);
        parameters.put(AfnemersIndicatieJbpmConstants.AF0X_GEMEENTE_KEY, "0519");
        parameters.put(AfnemersIndicatieJbpmConstants.AF0X_ANUMMER_KEY, A_NUMMER);

        parameters.put("input", berichtenDao.bewaarBericht(av01Bericht));

        final Map<String, Object> result = subject.execute(parameters);
        Assert.assertEquals(1, result.size());

        final Af11Bericht af11Bericht = (Af11Bericht) berichtenDao.leesBericht((Long) result.get("af11Bericht"));

        Assert.assertNotNull(af11Bericht);
        Assert.assertEquals(av01Bericht.getANummer(), af11Bericht.getANummer());
        Assert.assertEquals(av01Bericht.getDoelPartijCode(), af11Bericht.getBronPartijCode());
        Assert.assertEquals(av01Bericht.getBronPartijCode(), af11Bericht.getDoelPartijCode());

        Assert.assertEquals(av01Bericht.getMessageId(), af11Bericht.getCorrelationId());
        Assert.assertNotNull(af11Bericht.getMessageId());

        Assert.assertEquals(AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_I, af11Bericht.getHeaderWaarde(Lo3HeaderVeld.FOUTREDEN));
        Assert.assertEquals("0519", af11Bericht.getHeaderWaarde(Lo3HeaderVeld.GEMEENTE));
        Assert.assertEquals(A_NUMMER, af11Bericht.getHeaderWaarde(Lo3HeaderVeld.A_NUMMER));
    }

    @Test(expected = IllegalStateException.class)
    public void testLegeFoutreden() {
        final Av01Bericht av01Bericht = VerwijderenAfnIndTestUtil.maakAv01Bericht("059901", A_NUMMER);

        final Map<String, Object> parameters = new HashMap<>();
        parameters.put(AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_KEY, "");
        parameters.put(AfnemersIndicatieJbpmConstants.AF0X_GEMEENTE_KEY, "0519");
        parameters.put(AfnemersIndicatieJbpmConstants.AF0X_ANUMMER_KEY, A_NUMMER);

        parameters.put("input", berichtenDao.bewaarBericht(av01Bericht));

        final Map<String, Object> result = subject.execute(parameters);
        Assert.assertEquals(1, result.size());

        final Af11Bericht af11Bericht = (Af11Bericht) berichtenDao.leesBericht((Long) result.get("af11Bericht"));

        Assert.assertNotNull(af11Bericht);
        Assert.assertEquals(av01Bericht.getANummer(), af11Bericht.getANummer());
        Assert.assertEquals(av01Bericht.getDoelPartijCode(), af11Bericht.getBronPartijCode());
        Assert.assertEquals(av01Bericht.getBronPartijCode(), af11Bericht.getDoelPartijCode());

        Assert.assertEquals(av01Bericht.getMessageId(), af11Bericht.getCorrelationId());
        Assert.assertNotNull(af11Bericht.getMessageId());

        Assert.assertEquals(AfnemersIndicatieJbpmConstants.AF0X_FOUTREDEN_B, af11Bericht.getHeaderWaarde(Lo3HeaderVeld.FOUTREDEN));
        Assert.assertEquals("0519", af11Bericht.getHeaderWaarde(Lo3HeaderVeld.GEMEENTE));
        Assert.assertEquals(A_NUMMER, af11Bericht.getHeaderWaarde(Lo3HeaderVeld.A_NUMMER));
    }
}