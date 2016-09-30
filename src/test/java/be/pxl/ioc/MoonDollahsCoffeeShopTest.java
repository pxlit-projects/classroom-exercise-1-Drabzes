package be.pxl.ioc;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MoonDollahsCoffeeShopTest {

    @Test
    public void moonDollasShop_HasVickyGemmaAndGianlucaWorking() throws Exception {
        MoonDollahsCoffeeShop moonDollahsCoffeeShop = new MoonDollahsCoffeeShop();
        assertThat(moonDollahsCoffeeShop.getBaristas()).extracting(Barista::getName).containsExactly("vicky", "gemma", "gianluca");
    }

    @Test
    public void baristasHaveTheirOwnWorkEthics() throws Exception {
        MoonDollahsCoffeeShop moonDollahsCoffeeShop = new MoonDollahsCoffeeShop();
        List<Barista> baristas = moonDollahsCoffeeShop.getBaristas();
        assertThat(baristas)
                .filteredOn(barista -> barista.getName().equals("vicky"))
                .extracting(Barista::getWorkEthic)
                .containsOnly(new CustomerFriendlyWorkEthic());
        assertThat(baristas)
                .filteredOn(barista -> barista.getName().equals("gemma"))
                .extracting(Barista::getWorkEthic)
                .containsOnly(new LazyWorkEthic());
        assertThat(baristas)
                .filteredOn(barista -> barista.getName().equals("gianluca"))
                .extracting(Barista::getWorkEthic)
                .containsOnly(new BadHearingWorkEthic());
    }
}