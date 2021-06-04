/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at https://github.com/MinBZK/operatieBRP.
 */

package nl.bzk.migratiebrp.conversie.model.brp.groep;

import java.util.ArrayList;
import java.util.List;
import nl.bzk.migratiebrp.conversie.model.brp.BrpGroep;
import nl.bzk.migratiebrp.conversie.model.brp.BrpHistorieTest;
import nl.bzk.migratiebrp.conversie.model.brp.BrpStapel;
import nl.bzk.migratiebrp.conversie.model.brp.attribuut.BrpBoolean;
import org.junit.Test;

public class BrpOuderInhoudTest {

    @Test
    public void testGetIndicatieOuder() throws Exception {

    }

    @Test
    public void testGetIndicatieAdresgevendeOuder() throws Exception {

    }

    @Test
    public void testIsLeeg() throws Exception {

    }

    @Test
    public void testEquals() throws Exception {

    }

    @Test
    public void testHashCode() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }

    public static BrpOuderInhoud createInhoud(Boolean indicatieAdresGegevens) {
        return new BrpOuderInhoud(new BrpBoolean(indicatieAdresGegevens));
    }

    public static BrpStapel<BrpOuderInhoud> createStapel() {
        List<BrpGroep> groepen = new ArrayList<>();
        BrpGroep<BrpOuderInhoud> groep = new BrpGroep<>(createInhoud(false), BrpHistorieTest.createdefaultInhoud(), null, null, null);
        groepen.add(groep);
        return new BrpStapel(groepen);
    }
}