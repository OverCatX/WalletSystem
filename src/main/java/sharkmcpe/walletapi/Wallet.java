package sharkmcpe.walletapi;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import sharkmcpe.walletapi.Api.WalletAPI;

public class Wallet extends PluginBase implements Listener {

    public static Wallet wallet = null;
    private WalletAPI api;

    public static Wallet getMe(){
        return wallet;
    }
    @Override
    public void onLoad(){
        wallet = this;
    }
    @Override
    public void onEnable() {
        getLogger().info("สร้างโดย SharkMCPE");
        this.api = new WalletAPI(this);
        getServer().getPluginManager().registerEvents(this, this);
    }

    public WalletAPI getWalletApi(){
        return this.api;
    }
}
