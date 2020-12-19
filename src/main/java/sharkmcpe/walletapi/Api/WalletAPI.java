package sharkmcpe.walletapi.Api;

import cn.nukkit.utils.Config;
import sharkmcpe.walletapi.Wallet;


public class WalletAPI {

    public Wallet plugin;

    public WalletAPI(Wallet plugin) {
        this.plugin = plugin;
    }

    public void CreateData(String p) {
        Config data = new Config(plugin.getDataFolder() + "/wallet.yml", Config.YAML);
        if (!data.exists("Players.")) {
            data.set("Players." + p, 0);
            data.save();
        }
    }
    public void AddWallet(String p, int wallet) {
        Config data = new Config(plugin.getDataFolder() + "/wallet.yml", Config.YAML);
        data.set("Players." + p, data.getInt("Players." + p) + wallet);
        data.save();
    }
    public void RemoveWallet(String p, int wallet) {
        Config data = new Config(plugin.getDataFolder() + "/wallet.yml", Config.YAML);
        data.set("Players." + p, data.getInt("Players." + p) - wallet);
        data.save();
    }
    public int MyWallet(String p) {
        Config data = new Config(plugin.getDataFolder() + "/wallet.yml", Config.YAML);
        return data.getInt("Players." + p);
    }
}