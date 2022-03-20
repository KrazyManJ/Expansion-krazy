package me.KrazyManJ.Expansion_Krazy;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;


@SuppressWarnings("unused")
public class Expansion_Krazy extends PlaceholderExpansion {
    @Override
    public
    String getIdentifier() {
        return "krazy";
    }

    @Override
    public String getAuthor() {
        return "KrazyManJ";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onRequest(OfflinePlayer player, String params) {
        switch (params){
            case "targetedblock" -> {
                if (!player.isOnline()) return "";
                if (((Player) player).getTargetBlockExact(5) == null) return "";

                return ((Player) player).getTargetBlockExact(5).getType().toString().toLowerCase();
            }
        }
        return null;
    }
}
