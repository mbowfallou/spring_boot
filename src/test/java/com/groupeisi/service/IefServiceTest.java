package com.groupeisi.service;

import com.groupeisi.dto.Ia;
import com.groupeisi.dto.Ief;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class IefServiceTest {

    @Autowired
    private IefService iefService;

    @Test
    void getIefs() {
        int taille = iefService.getIefs().size();

        Assertions.assertEquals(1, taille);
    }

    @Test
    void getIef() {
        Ief ief = new Ief();
        ief.setNom("IEF Thies Nord");

        Ief ief_save = iefService.getIef(1);

        Assertions.assertEquals(ief.getNom(), ief_save.getNom());
    }

    @Test
    void getIefByName() {
        Ief ief = iefService.getIefByName("IEF Thies Nord");

        Assertions.assertNotNull(ief);
    }

    @Test
    void createIef() {
        Ief ief = new Ief();
        Ia ia = new Ia();

        ief.setNom("IEF Thies Nord");

        Ief ief_save = iefService.createIef(ief);

        Assertions.assertNotNull(ief_save);
    }

    @Test
    void updateIef() {
        Ief ief = new Ief();
        ief.setNom("IEF de Thies Sud");

        Ief ief_update = iefService.updateIef(1, ief);

        Assertions.assertEquals(ief.getNom(), ief_update.getNom());
    }

    @Test
    void deleteIef() {
        iefService.deleteIef(2);

        Assertions.assertTrue(true);
    }
}