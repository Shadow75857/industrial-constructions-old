fissionReactor = new NuclearReactor("fission-reactor"){{
            requirements(Category.power, with(Items.titanium, 5000));
            ambientSound = Sounds.hum;
            ambientSoundVolume = 0.24f;
            size = 5;
            health = 200;
            itemDuration = 1000f;
            heating = 0.02f;
            outputsLiquid = true;
            outputsItems = true;
  
            outputLiquid = new LiquidStack(Liquids.slag, 100f / 60f);
            outputItem = newItemStack(Items.sand, 1)

            consumeItem(Items.thorium);
            consumeLiquid(Liquids.cryofluid, heating / coolantPower).update(false);
        }};
