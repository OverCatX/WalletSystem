package sharkmcpe.walletapi;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class Wallet extends PluginBase implements Listener {
    
    static Wallet wallet = null;
    
    public static Mail getMe(){
      return wallet;
    }
    @Override
    public void onLoad(){
        wallet = this;
    }
    @Override
    public void onEnable() {
        getLogger().info("สร้างโดย SharkMCPE");
        getServer().getPluginManager().registerEvents(this, this);
    }
}
