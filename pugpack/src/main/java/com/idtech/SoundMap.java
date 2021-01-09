package com.idtech;

import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;

public class SoundMap {
	
	public static String[] soundStrings = {
			"AMBIENT_CAVE",
			"BLOCK_ANVIL_BREAK",
			"BLOCK_ANVIL_DESTROY",
			"BLOCK_ANVIL_FALL",
			"BLOCK_ANVIL_HIT",
			"BLOCK_ANVIL_LAND",
			"BLOCK_ANVIL_PLACE",
			"BLOCK_ANVIL_STEP",
			"BLOCK_ANVIL_USE",
			"ENTITY_ARMORSTAND_BREAK",
			"ENTITY_ARMORSTAND_FALL",
			"ENTITY_ARMORSTAND_HIT",
			"ENTITY_ARMORSTAND_PLACE",
			"ITEM_ARMOR_EQUIP_CHAIN",
			"ITEM_ARMOR_EQUIP_DIAMOND",
			"ITEM_ARMOR_EQIIP_ELYTRA",
			"ITEM_ARMOR_EQUIP_GENERIC",
			"ITEM_ARMOR_EQUIP_GOLD",
			"ITEM_ARMOR_EQUIP_IRON",
			"ITEM_ARMOR_EQUIP_LEATHER",
			"ENTITY_ARROW_HIT",
			"ENTITY_ARROW_HIT_PLAYER",
			"ENTITY_ARROW_SHOOT",
			"ENTITY_BAT_AMBIENT",
			"ENTITY_BAT_DEATH",
			"ENTITY_BAT_HURT",
			"ENTITY_BAT_LOOP",
			"ENTITY_BAT_TAKEOFF",
			"ENTITY_BLAZE_AMBIENT",
			"ENTITY_BLAZE_BURN",
			"ENTITY_BLAZE_DEATH",
			"ENTITY_BLAZE_HURT",
			"ENTITY_BLAZE_SHOOT",
			"ENTITY_BOBBER_SPLASH",
			"ENTITY_BOBBER_THROW",
			"ITEM_BOTTLE_EMPTY",
			"ITEM_BOTTLE_FILL",
			"ITEM_BOTTLE_FILL_DRAGONBREATH",
			"BLOCK_BREWING_STAND_BREW",
			"ITEM_BUCKET_EMPTY",
			"ITEM_BUCKET_EMPTY_LAVA",
			"ITEM_BUCKET_FILL",
			"ITEM_BUCKET_FILL_LAVA",
			"ENTITY_CAT_AMBIENT",
			"ENTITY_CAT_DEATH",
			"ENTITY_CAT_HISS",
			"ENTITY_CAT_HURT",
			"ENTITY_CAT_PURR",
			"ENTITY_CAT_PURREOW",
			"BLOCK_CHEST_CLOSE",
			"BLOCK_CHEST_LOCKED",
			"BLOCK_CHEST_OPEN",
			"ENTITY_CHICKEN_AMBIENT",
			"ENTITY_CHICKEN_DEATH",
			"ENTITY_CHICKEN_EGG",
			"ENTITY_CHICKEN_HURT",
			"ENTITY_CHICKEN_STEP",
			"BLOCK_CHORUS_FLOWER_DEATH",
			"BLOCK_CHORUS_FLOWER_GROW",
			"ITEM_CHORUS_FRUIT_TELEPORT",
			"BLOCK_CLOTH_BREAK",
			"BLOCK_CLOTH_FALL",
			"BLOCK_CLOTH_HIT",
			"BLOCK_CLOTH_PLACE",
			"BLOCK_CLOTH_STEP",
			"BLOCK_COMPARATOR_CLICK",
			"ENTITY_COW_AMBIENT",
			"ENTITY_COW_DEATH",
			"ENTITY_COW_HURT",
			"ENTITY_COW_MILK",
			"ENTITY_COW_STEP",
			"ENTITY_CREEPER_DEATH",
			"ENTITY_CREEPER_HURT",
			"ENTITY_CREEPER_PRIMED",
			"BLOCK_DISPENSER_DISPENSE",
			"BLOCK_DISPENSER_FAIL",
			"BLOCK_DISPENSER_LAUNCH",
			"ENTITY_DONKEY_AMBIENT",
			"ENTITY_DONKEY_ANGRY",
			"ENTITY_DONKEY_CHEST",
			"ENTITY_DONKEY_DEATH",
			"ENTITY_DONKEY_HURT",
			"ENTITY_EGG_THROW",
			"ENTITY_ELDER_GUARDIAN_AMBIENT",
			"ENTITY_ELDERGUARDIAN_AMBIENTLAND",
			"ENTITY_ELDER_GUARDIAN_CURSE",
			"ENTITY_ELDER_GUARDIAN_DEATH",
			"ENTITY_ELDER_GUARDIAN_DEATH_LAND",
			"ENTITY_ELDER_GUARDIAN_FLOP",
			"ENTITY_ELDER_GUARDIAN_HURT",
			"ENTITY_ELDER_GUARDIAN_HURT_LAND",
			"ITEM_ELYTRA_FLYING",
			"BLOCK_ENCHANTMENT_TABLE_USE",
			"BLOCK_ENDERCHEST_CLOSE",
			"BLOCK_ENDERCHEST_OPEN",
			"ENTITY_ENDERDRAGON_AMBIENT",
			"ENTITY_ENDERDRAGON_DEATH",
			"ENTITY_ENDERDRAGON_FIREBALL_EPLD",
			"ENTITY_ENDERDRAGON_FLAP",
			"ENTITY_ENDERDRAGON_GROWL",
			"ENTITY_ENDERDRAGON_HURT",
			"ENTITY_ENDERDRAGON_SHOOT",
			"ENTITY_ENDEREYE_LAUNCH",
			"ENTITY_ENDERMEN_AMBIENT",
			"ENTITY_ENDERMEN_DEATH",
			"ENTITY_ENDERMEN_HURT",
			"ENTITY_ENDERMEN_SCREAM",
			"ENTITY_ENDERMEN_STARE",
			"ENTITY_ENDERMEN_TELEPORT",
			"ENTITY_ENDERMITE_AMBIENT",
			"ENTITY_ENDERMITE_DEATH",
			"ENTITY_ENDERMITE_HURT",
			"ENTITY_ENDERMITE_STEP",
			"ENTITY_ENDERPEARL_THROW",
			"BLOCK_END_GATEWAY_SPAWN",
			"EVOCATION_FANGS_ATTACK",
			"ENTITY_EVOCATION_ILLAGER_AMBIENT",
			"EVOCATION_ILLAGER_CAST_SPELL",
			"EVOCATION_ILLAGER_DEATH",
			"ENTITY_EVOCATION_ILLAGER_HURT",
			"EVOCATION_ILLAGER_PREPARE_ATTACK",
			"EVOCATION_ILLAGER_PREPARE_SUMMON",
			"EVOCATION_ILLAGER_PREPARE_WOLOLO",
			"ENTITY_EXPERIENCE_BOTTLE_THROW",
			"ENTITY_EXPERIENCE_ORB_PICKUP",
			"BLOCK_FENCE_GATE_CLOSE",
			"BLOCK_FENCE_GATE_OPEN",
			"ITEM_FIRECHARGE_USE",
			"ENTITY_FIREWORK_BLAST",
			"ENTITY_FIREWORK_BLAST_FAR",
			"ENTITY_FIREWORK_LARGE_BLAST",
			"ENTITY_FIREWORK_LARGE_BLAST_FAR",
			"ENTITY_FIREWORK_LAUNCH",
			"ENTITY_FIREWORK_SHOOT",
			"ENTITY_FIREWORK_TWINKLE",
			"ENTITY_FIREWORK_TWINKLE_FAR",
			"BLOCK_FIRE_AMBIENT",
			"BLOCK_FIRE_EXTINGUISH",
			"ITEM_FLINTANDSTEEL_USE",
			"BLOCK_FURNACE_FIRE_CRACKLE",
			"ENTITY_GENERIC_BIG_FALL",
			"ENTITY_GENERIC_BURN",
			"ENTITY_GENERIC_DEATH",
			"ENTITY_GENERIC_DRINK",
			"ENTITY_GENERIC_EAT",
			"ENTITY_GENERIC_EXPLODE",
			"ENTITY_GENERIC_EXTINGUISH_FIRE",
			"ENTITY_GENERIC_HURT",
			"ENTITY_GENERIC_SMALL_FALL",
			"ENTITY_GENERIC_SPLASH",
			"ENTITY_GENERIC_SWIM",
			"ENTITY_GHAST_AMBIENT",
			"ENTITY_GHAST_DEATH",
			"ENTITY_GHAST_HURT",
			"ENTITY_GHAST_SCREAM",
			"ENTITY_GHAST_SHOOT",
			"ENTITY_GHAST_WARN",
			"BLOCK_GLASS_BREAK",
			"BLOCK_GLASS_FALL",
			"BLOCK_GLASS_HIT",
			"BLOCK_GLASS_PLACE",
			"BLOCK_GLASS_STEP",
			"BLOCK_GRASS_BREAK",
			"BLOCK_GRASS_FALL",
			"BLOCK_GRASS_HIT",
			"BLOCK_GRASS_PLACE",
			"BLOCK_GRASS_STEP",
			"BLOCK_GRAVEL_BREAK",
			"BLOCK_GRAVEL_FALL",
			"BLOCK_GRAVEL_HIT",
			"BLOCK_GRAVEL_PLACE",
			"BLOCK_GRAVEL_STEP",
			"ENTITY_GUARDIAN_AMBIENT",
			"ENTITY_GUARDIAN_AMBIENT_LAND",
			"ENTITY_GUARDIAN_ATTACK",
			"ENTITY_GUARDIAN_DEATH",
			"ENTITY_GUARDIAN_DEATH_LAND",
			"ENTITY_GUARDIAN_FLOP",
			"ENTITY_GUARDIAN_HURT",
			"ENTITY_GUARDIAN_HURT_LAND",
			"ITEM_HOE_TILL",
			"ENTITY_HORSE_AMBIENT",
			"ENTITY_HORSE_ANGRY",
			"ENTITY_HORSE_ARMOR",
			"ENTITY_HORSE_BREATHE",
			"ENTITY_HORSE_DEATH",
			"ENTITY_HORSE_EAT",
			"ENTITY_HORSE_GALLOP",
			"ENTITY_HORSE_HURT",
			"ENTITY_HORSE_JUMP",
			"ENTITY_HORSE_LAND",
			"ENTITY_HORSE_SADDLE",
			"ENTITY_HORSE_STEP",
			"ENTITY_HORSE_STEP_WOOD",
			"ENTITY_HOSTILE_BIG_FALL",
			"ENTITY_HOSTILE_DEATH",
			"ENTITY_HOSTILE_HURT",
			"ENTITY_HOSTILE_SMALL_FALL",
			"ENTITY_HOSTILE_SPLASH",
			"ENTITY_HOSTILE_SWIM",
			"ENTITY_HUSK_AMBIENT",
			"ENTITY_HUSK_DEATH",
			"ENTITY_HUSK_HURT",
			"ENTITY_HUSK_STEP",
			"ENTITY_IRONGOLEM_ATTACK",
			"ENTITY_IRONGOLEM_DEATH",
			"ENTITY_IRONGOLEM_HURT",
			"ENTITY_IRONGOLEM_STEP",
			"BLOCK_IRON_DOOR_CLOSE",
			"BLOCK_IRON_DOOR_OPEN",
			"BLOCK_IRON_TRAPDOOR_CLOSE",
			"BLOCK_IRON_TRAPDOOR_OPEN",
			"ENTITY_ITEMFRAME_ADD_ITEM",
			"ENTITY_ITEMFRAME_BREAK",
			"ENTITY_ITEMFRAME_PLACE",
			"ENTITY_ITEMFRAME_REMOVE_ITEM",
			"ENTITY_ITEMFRAME_ROTATE_ITEM",
			"ENTITY_ITEM_BREAK",
			"ENTITY_ITEM_PICKUP",
			"BLOCK_LADDER_BREAK",
			"BLOCK_LADDER_FALL",
			"BLOCK_LADDER_HIT",
			"BLOCK_LADDER_PLACE",
			"BLOCK_LADDER_STEP",
			"BLOCK_LAVA_AMBIENT",
			"BLOCK_LAVA_EXTINGUISH",
			"BLOCK_LAVA_POP",
			"ENTITY_LEASHKNOT_BREAK",
			"ENTITY_LEASHKNOT_PLACE",
			"BLOCK_LEVER_CLICK",
			"ENTITY_LIGHTNING_IMPACT",
			"ENTITY_LIGHTNING_THUNDER",
			"ENTITY_LINGERINGPOTION_THROW",
			"ENTITY_LLAMA_AMBIENT",
			"ENTITY_LLAMA_ANGRY",
			"ENTITY_LLAMA_CHEST",
			"ENTITY_LLAMA_DEATH",
			"ENTITY_LLAMA_EAT",
			"ENTITY_LLAMA_HURT",
			"ENTITY_LLAMA_SPIT",
			"ENTITY_LLAMA_STEP",
			"ENTITY_LLAMA_SWAG",
			"ENTITY_MAGMACUBE_DEATH",
			"ENTITY_MAGMACUBE_HURT",
			"ENTITY_MAGMACUBE_JUMP",
			"ENTITY_MAGMACUBE_SQUISH",
			"BLOCK_METAL_BREAK",
			"BLOCK_METAL_FALL",
			"BLOCK_METAL_HIT",
			"BLOCK_METAL_PLACE",
			"BLOCK_METAL_PRESSPLATE_CLICK_OFF",
			"BLOCK_METAL_PRESSPLATE_CLICK_ON",
			"BLOCK_METAL_STEP",
			"ENTITY_MINECART_INSIDE",
			"ENTITY_MINECART_RIDING",
			"ENTITY_MOOSHROOM_SHEAR",
			"ENTITY_MULE_AMBIENT",
			"ENTITY_MULE_CHEST",
			"ENTITY_MULE_DEATH",
			"ENTITY_MULE_HURT",
			"MUSIC_CREATIVE",
			"MUSIC_CREDITS",
			"MUSIC_DRAGON",
			"MUSIC_END",
			"MUSIC_GAME",
			"MUSIC_MENU",
			"MUSIC_NETHER",
			"BLOCK_NOTE_BASEDRUM",
			"BLOCK_NOTE_BASS",
			"BLOCK_NOTE_HARP",
			"BLOCK_NOTE_HAT",
			"BLOCK_NOTE_PLING",
			"BLOCK_NOTE_SNARE",
			"ENTITY_PAINTING_BREAK",
			"ENTITY_PAINTING_PLACE",
			"ENTITY_PIG_AMBIENT",
			"ENTITY_PIG_DEATH",
			"ENTITY_PIG_HURT",
			"ENTITY_PIG_SADDLE",
			"ENTITY_PIG_STEP",
			"BLOCK_PISTON_CONTRACT",
			"BLOCK_PISTON_EXTEND",
			"ENTITY_PLAYER_ATTACK_CRIT",
			"ENTITY_PLAYER_ATTACK_KNOCKBACK",
			"ENTITY_PLAYER_ATTACK_NODAMAGE",
			"ENTITY_PLAYER_ATTACK_STRONG",
			"ENTITY_PLAYER_ATTACK_SWEEP",
			"ENTITY_PLAYER_ATTACK_WEAK",
			"ENTITY_PLAYER_BIG_FALL",
			"ENTITY_PLAYER_BREATH",
			"ENTITY_PLAYER_BURP",
			"ENTITY_PLAYER_DEATH",
			"ENTITY_PLAYER_HURT",
			"ENTITY_PLAYER_LEVELUP",
			"ENTITY_PLAYER_SMALL_FALL",
			"ENTITY_PLAYER_SPLASH",
			"ENTITY_PLAYER_SWIM",
			"ENTITY_POLAR_BEAR_AMBIENT",
			"ENTITY_POLAR_BEAR_BABY_AMBIENT",
			"ENTITY_POLAR_BEAR_DEATH",
			"ENTITY_POLAR_BEAR_HURT",
			"ENTITY_POLAR_BEAR_STEP",
			"ENTITY_POLAR_BEAR_WARNING",
			"BLOCK_PORTAL_AMBIENT",
			"BLOCK_PORTAL_TRAVEL",
			"BLOCK_PORTAL_TRIGGER",
			"ENTITY_RABBIT_AMBIENT",
			"ENTITY_RABBIT_ATTACK",
			"ENTITY_RABBIT_DEATH",
			"ENTITY_RABBIT_HURT",
			"ENTITY_RABBIT_JUMP",
			"RECORD_11",
			"RECORD_13",
			"RECORD_BLOCKS",
			"RECORD_CAT",
			"RECORD_CHIRP",
			"RECORD_FAR",
			"RECORD_MALL",
			"RECORD_MELLOHI",
			"RECORD_STAL",
			"RECORD_STRAD",
			"RECORD_WAIT",
			"RECORD_WARD",
			"BLOCK_REDSTONE_TORCH_BURNOUT",
			"BLOCK_SAND_BREAK",
			"BLOCK_SAND_FALL",
			"BLOCK_SAND_HIT",
			"BLOCK_SAND_PLACE",
			"BLOCK_SAND_STEP",
			"ENTITY_SHEEP_AMBIENT",
			"ENTITY_SHEEP_DEATH",
			"ENTITY_SHEEP_HURT",
			"ENTITY_SHEEP_SHEAR",
			"ENTITY_SHEEP_STEP",
			"ITEM_SHIELD_BLOCK",
			"ITEM_SHIELD_BREAK",
			"ITEM_SHOVEL_FLATTEN",
			"ENTITY_SHULKER_AMBIENT",
			"BLOCK_SHULKER_BOX_CLOSE",
			"BLOCK_SHULKER_BOX_OPEN",
			"ENTITY_SHULKER_BULLET_HIT",
			"ENTITY_SHULKER_BULLET_HURT",
			"ENTITY_SHULKER_CLOSE",
			"ENTITY_SHULKER_DEATH",
			"ENTITY_SHULKER_HURT",
			"ENTITY_SHULKER_HURT_CLOSED",
			"ENTITY_SHULKER_OPEN",
			"ENTITY_SHULKER_SHOOT",
			"ENTITY_SHULKER_TELEPORT",
			"ENTITY_SILVERFISH_AMBIENT",
			"ENTITY_SILVERFISH_DEATH",
			"ENTITY_SILVERFISH_HURT",
			"ENTITY_SILVERFISH_STEP",
			"ENTITY_SKELETON_AMBIENT",
			"ENTITY_SKELETON_DEATH",
			"ENTITY_SKELETON_HORSE_AMBIENT",
			"ENTITY_SKELETON_HORSE_DEATH",
			"ENTITY_SKELETON_HORSE_HURT",
			"ENTITY_SKELETON_HURT",
			"ENTITY_SKELETON_SHOOT",
			"ENTITY_SKELETON_STEP",
			"ENTITY_SLIME_ATTACK",
			"BLOCK_SLIME_BREAK",
			"ENTITY_SLIME_DEATH",
			"BLOCK_SLIME_FALL",
			"BLOCK_SLIME_HIT",
			"ENTITY_SLIME_HURT",
			"ENTITY_SLIME_JUMP",
			"BLOCK_SLIME_PLACE",
			"ENTITY_SLIME_SQUISH",
			"BLOCK_SLIME_STEP",
			"ENTITY_SMALL_MAGMACUBE_DEATH",
			"ENTITY_SMALL_MAGMACUBE_HURT",
			"ENTITY_SMALL_MAGMACUBE_SQUISH",
			"ENTITY_SMALL_SLIME_DEATH",
			"ENTITY_SMALL_SLIME_HURT",
			"ENTITY_SMALL_SLIME_JUMP",
			"ENTITY_SMALL_SLIME_SQUISH",
			"ENTITY_SNOWBALL_THROW",
			"ENTITY_SNOWMAN_AMBIENT",
			"ENTITY_SNOWMAN_DEATH",
			"ENTITY_SNOWMAN_HURT",
			"ENTITY_SNOWMAN_SHOOT",
			"BLOCK_SNOW_BREAK",
			"BLOCK_SNOW_FALL",
			"BLOCK_SNOW_HIT",
			"BLOCK_SNOW_PLACE",
			"BLOCK_SNOW_STEP",
			"ENTITY_SPIDER_AMBIENT",
			"ENTITY_SPIDER_DEATH",
			"ENTITY_SPIDER_HURT",
			"ENTITY_SPIDER_STEP",
			"ENTITY_SPLASH_POTION_BREAK",
			"ENTITY_SPLASH_POTION_THROW",
			"ENTITY_SQUID_AMBIENT",
			"ENTITY_SQUID_DEATH",
			"ENTITY_SQUID_HURT",
			"BLOCK_STONE_BREAK",
			"BLOCK_STONE_BUTTON_CLICK_OFF",
			"BLOCK_STONE_BUTTON_CLICK_ON",
			"BLOCK_STONE_FALL",
			"BLOCK_STONE_HIT",
			"BLOCK_STONE_PLACE",
			"BLOCK_STONE_PRESSPLATE_CLICK_OFF",
			"BLOCK_STONE_PRESSPLATE_CLICK_ON",
			"BLOCK_STONE_STEP",
			"ENTITY_STRAY_AMBIENT",
			"ENTITY_STRAY_DEATH",
			"ENTITY_STRAY_HURT",
			"ENTITY_STRAY_STEP",
			"ENCHANT_THORNS_HIT",
			"ENTITY_TNT_PRIMED",
			"ITEM_TOTEM_USE",
			"BLOCK_TRIPWIRE_ATTACH",
			"BLOCK_TRIPWIRE_CLICK_OFF",
			"BLOCK_TRIPWIRE_CLICK_ON",
			"BLOCK_TRIPWIRE_DETACH",
			"UI_BUTTON_CLICK",
			"ENTITY_VEX_AMBIENT",
			"ENTITY_VEX_CHARGE",
			"ENTITY_VEX_DEATH",
			"ENTITY_VEX_HURT",
			"ENTITY_VILLAGER_AMBIENT",
			"ENTITY_VILLAGER_DEATH",
			"ENTITY_VILLAGER_HURT",
			"ENTITY_VILLAGER_NO",
			"ENTITY_VILLAGER_TRADING",
			"ENTITY_VILLAGER_YES",
			"VINDICATION_ILLAGER_AMBIENT",
			"VINDICATION_ILLAGER_DEATH",
			"ENTITY_VINDICATION_ILLAGER_HURT",
			"BLOCK_WATERLILY_PLACE",
			"BLOCK_WATER_AMBIENT",
			"WEATHER_RAIN",
			"WEATHER_RAIN_ABOVE",
			"ENTITY_WITCH_AMBIENT",
			"ENTITY_WITCH_DEATH",
			"ENTITY_WITCH_DRINK",
			"ENTITY_WITCH_HURT",
			"ENTITY_WITCH_THROW",
			"ENTITY_WITHER_AMBIENT",
			"ENTITY_WITHER_BREAK_BLOCK",
			"ENTITY_WITHER_DEATH",
			"ENTITY_WITHER_HURT",
			"ENTITY_WITHER_SHOOT",
			"ENTITY_WITHER_SKELETON_AMBIENT",
			"ENTITY_WITHER_SKELETON_DEATH",
			"ENTITY_WITHER_SKELETON_HURT",
			"ENTITY_WITHER_SKELETON_STEP",
			"ENTITY_WITHER_SPAWN",
			"ENTITY_WOLF_AMBIENT",
			"ENTITY_WOLF_DEATH",
			"ENTITY_WOLF_GROWL",
			"ENTITY_WOLF_HOWL",
			"ENTITY_WOLF_HURT",
			"ENTITY_WOLF_PANT",
			"ENTITY_WOLF_SHAKE",
			"ENTITY_WOLF_STEP",
			"ENTITY_WOLF_WHINE",
			"BLOCK_WOODEN_DOOR_CLOSE",
			"BLOCK_WOODEN_DOOR_OPEN",
			"BLOCK_WOODEN_TRAPDOOR_CLOSE",
			"BLOCK_WOODEN_TRAPDOOR_OPEN",
			"BLOCK_WOOD_BREAK",
			"BLOCK_WOOD_BUTTON_CLICK_OFF",
			"BLOCK_WOOD_BUTTON_CLICK_ON",
			"BLOCK_WOOD_FALL",
			"BLOCK_WOOD_HIT",
			"BLOCK_WOOD_PLACE",
			"BLOCK_WOOD_PRESSPLATE_CLICK_OFF",
			"BLOCK_WOOD_PRESSPLATE_CLICK_ON",
			"BLOCK_WOOD_STEP",
			"ENTITY_ZOMBIE_AMBIENT",
			"ENTITY_ZOMBIE_ATTACK_DOOR_WOOD",
			"ENTITY_ZOMBIE_ATTACK_IRON_DOOR",
			"ENTITY_ZOMBIE_BREAK_DOOR_WOOD",
			"ENTITY_ZOMBIE_DEATH",
			"ENTITY_ZOMBIE_HORSE_AMBIENT",
			"ENTITY_ZOMBIE_HORSE_DEATH",
			"ENTITY_ZOMBIE_HORSE_HURT",
			"ENTITY_ZOMBIE_HURT",
			"ENTITY_ZOMBIE_INFECT",
			"ENTITY_ZOMBIE_PIG_AMBIENT",
			"ENTITY_ZOMBIE_PIG_ANGRY",
			"ENTITY_ZOMBIE_PIG_DEATH",
			"ENTITY_ZOMBIE_PIG_HURT",
			"ENTITY_ZOMBIE_STEP",
			"ENTITY_ZOMBIE_VILLAGER_AMBIENT",
			"ENTITY_ZOMBIE_VILLAGER_CONVERTED",
			"ENTITY_ZOMBIE_VILLAGER_CURE",
			"ENTITY_ZOMBIE_VILLAGER_DEATH",
			"ENTITY_ZOMBIE_VILLAGER_HURT",
			"ENTITY_ZOMBIE_VILLAGER_STEP"};
	
	public static SoundEvent[] soundEvents = { 
			SoundEvents.AMBIENT_CAVE,
			SoundEvents.BLOCK_ANVIL_BREAK,
			SoundEvents.BLOCK_ANVIL_DESTROY,
			SoundEvents.BLOCK_ANVIL_FALL,
			SoundEvents.BLOCK_ANVIL_HIT,
			SoundEvents.BLOCK_ANVIL_LAND,
			SoundEvents.BLOCK_ANVIL_PLACE,
			SoundEvents.BLOCK_ANVIL_STEP,
			SoundEvents.BLOCK_ANVIL_USE,
			SoundEvents.ENTITY_ARMORSTAND_BREAK,
			SoundEvents.ENTITY_ARMORSTAND_FALL,
			SoundEvents.ENTITY_ARMORSTAND_HIT,
			SoundEvents.ENTITY_ARMORSTAND_PLACE,
			SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
			SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
			SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
			SoundEvents.ITEM_ARMOR_EQUIP_IRON,
			SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
			SoundEvents.ENTITY_ARROW_HIT,
			SoundEvents.ENTITY_ARROW_HIT_PLAYER,
			SoundEvents.ENTITY_ARROW_SHOOT,
			SoundEvents.ENTITY_BAT_AMBIENT,
			SoundEvents.ENTITY_BAT_DEATH,
			SoundEvents.ENTITY_BAT_HURT,
			SoundEvents.ENTITY_BAT_LOOP,
			SoundEvents.ENTITY_BAT_TAKEOFF,
			SoundEvents.ENTITY_BLAZE_AMBIENT,
			SoundEvents.ENTITY_BLAZE_BURN,
			SoundEvents.ENTITY_BLAZE_DEATH,
			SoundEvents.ENTITY_BLAZE_HURT,
			SoundEvents.ENTITY_BLAZE_SHOOT,
			SoundEvents.ENTITY_BOBBER_SPLASH,
			SoundEvents.ENTITY_BOBBER_THROW,
			SoundEvents.ITEM_BOTTLE_EMPTY,
			SoundEvents.ITEM_BOTTLE_FILL,
			SoundEvents.ITEM_BOTTLE_FILL_DRAGONBREATH,
			SoundEvents.BLOCK_BREWING_STAND_BREW,
			SoundEvents.ITEM_BUCKET_EMPTY,
			SoundEvents.ITEM_BUCKET_EMPTY_LAVA,
			SoundEvents.ITEM_BUCKET_FILL,
			SoundEvents.ITEM_BUCKET_FILL_LAVA,
			SoundEvents.ENTITY_CAT_AMBIENT,
			SoundEvents.ENTITY_CAT_DEATH,
			SoundEvents.ENTITY_CAT_HISS,
			SoundEvents.ENTITY_CAT_HURT,
			SoundEvents.ENTITY_CAT_PURR,
			SoundEvents.ENTITY_CAT_PURREOW,
			SoundEvents.BLOCK_CHEST_CLOSE,
			SoundEvents.BLOCK_CHEST_LOCKED,
			SoundEvents.BLOCK_CHEST_OPEN,
			SoundEvents.ENTITY_CHICKEN_AMBIENT,
			SoundEvents.ENTITY_CHICKEN_DEATH,
			SoundEvents.ENTITY_CHICKEN_EGG,
			SoundEvents.ENTITY_CHICKEN_HURT,
			SoundEvents.ENTITY_CHICKEN_STEP,
			SoundEvents.BLOCK_CHORUS_FLOWER_DEATH,
			SoundEvents.BLOCK_CHORUS_FLOWER_GROW,
			SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT,
			SoundEvents.BLOCK_CLOTH_BREAK,
			SoundEvents.BLOCK_CLOTH_FALL,
			SoundEvents.BLOCK_CLOTH_HIT,
			SoundEvents.BLOCK_CLOTH_PLACE,
			SoundEvents.BLOCK_CLOTH_STEP,
			SoundEvents.BLOCK_COMPARATOR_CLICK,
			SoundEvents.ENTITY_COW_AMBIENT,
			SoundEvents.ENTITY_COW_DEATH,
			SoundEvents.ENTITY_COW_HURT,
			SoundEvents.ENTITY_COW_MILK,
			SoundEvents.ENTITY_COW_STEP,
			SoundEvents.ENTITY_CREEPER_DEATH,
			SoundEvents.ENTITY_CREEPER_HURT,
			SoundEvents.ENTITY_CREEPER_PRIMED,
			SoundEvents.BLOCK_DISPENSER_DISPENSE,
			SoundEvents.BLOCK_DISPENSER_FAIL,
			SoundEvents.BLOCK_DISPENSER_LAUNCH,
			SoundEvents.ENTITY_DONKEY_AMBIENT,
			SoundEvents.ENTITY_DONKEY_ANGRY,
			SoundEvents.ENTITY_DONKEY_CHEST,
			SoundEvents.ENTITY_DONKEY_DEATH,
			SoundEvents.ENTITY_DONKEY_HURT,
			SoundEvents.ENTITY_EGG_THROW,
			SoundEvents.ENTITY_ELDER_GUARDIAN_AMBIENT,
			SoundEvents.ENTITY_ELDERGUARDIAN_AMBIENTLAND,
			SoundEvents.ENTITY_ELDER_GUARDIAN_CURSE,
			SoundEvents.ENTITY_ELDER_GUARDIAN_DEATH,
			SoundEvents.ENTITY_ELDER_GUARDIAN_DEATH_LAND,
			SoundEvents.ENTITY_ELDER_GUARDIAN_FLOP,
			SoundEvents.ENTITY_ELDER_GUARDIAN_HURT,
			SoundEvents.ENTITY_ELDER_GUARDIAN_HURT_LAND,
			SoundEvents.ITEM_ELYTRA_FLYING,
			SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE,
			SoundEvents.BLOCK_ENDERCHEST_CLOSE,
			SoundEvents.BLOCK_ENDERCHEST_OPEN,
			SoundEvents.ENTITY_ENDERDRAGON_AMBIENT,
			SoundEvents.ENTITY_ENDERDRAGON_DEATH,
			SoundEvents.ENTITY_ENDERDRAGON_FIREBALL_EPLD,
			SoundEvents.ENTITY_ENDERDRAGON_FLAP,
			SoundEvents.ENTITY_ENDERDRAGON_GROWL,
			SoundEvents.ENTITY_ENDERDRAGON_HURT,
			SoundEvents.ENTITY_ENDERDRAGON_SHOOT,
			SoundEvents.ENTITY_ENDEREYE_LAUNCH,
			SoundEvents.ENTITY_ENDERMEN_AMBIENT,
			SoundEvents.ENTITY_ENDERMEN_DEATH,
			SoundEvents.ENTITY_ENDERMEN_HURT,
			SoundEvents.ENTITY_ENDERMEN_SCREAM,
			SoundEvents.ENTITY_ENDERMEN_STARE,
			SoundEvents.ENTITY_ENDERMEN_TELEPORT,
			SoundEvents.ENTITY_ENDERMITE_AMBIENT,
			SoundEvents.ENTITY_ENDERMITE_DEATH,
			SoundEvents.ENTITY_ENDERMITE_HURT,
			SoundEvents.ENTITY_ENDERMITE_STEP,
			SoundEvents.ENTITY_ENDERPEARL_THROW,
			SoundEvents.BLOCK_END_GATEWAY_SPAWN,
			SoundEvents.EVOCATION_FANGS_ATTACK,
			SoundEvents.ENTITY_EVOCATION_ILLAGER_AMBIENT,
			SoundEvents.EVOCATION_ILLAGER_CAST_SPELL,
			SoundEvents.EVOCATION_ILLAGER_DEATH,
			SoundEvents.ENTITY_EVOCATION_ILLAGER_HURT,
			SoundEvents.EVOCATION_ILLAGER_PREPARE_ATTACK,
			SoundEvents.EVOCATION_ILLAGER_PREPARE_SUMMON,
			SoundEvents.EVOCATION_ILLAGER_PREPARE_WOLOLO,
			SoundEvents.ENTITY_EXPERIENCE_BOTTLE_THROW,
			SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP,
			SoundEvents.BLOCK_FENCE_GATE_CLOSE,
			SoundEvents.BLOCK_FENCE_GATE_OPEN,
			SoundEvents.ITEM_FIRECHARGE_USE,
			SoundEvents.ENTITY_FIREWORK_BLAST,
			SoundEvents.ENTITY_FIREWORK_BLAST_FAR,
			SoundEvents.ENTITY_FIREWORK_LARGE_BLAST,
			SoundEvents.ENTITY_FIREWORK_LARGE_BLAST_FAR,
			SoundEvents.ENTITY_FIREWORK_LAUNCH,
			SoundEvents.ENTITY_FIREWORK_SHOOT,
			SoundEvents.ENTITY_FIREWORK_TWINKLE,
			SoundEvents.ENTITY_FIREWORK_TWINKLE_FAR,
			SoundEvents.BLOCK_FIRE_AMBIENT,
			SoundEvents.BLOCK_FIRE_EXTINGUISH,
			SoundEvents.ITEM_FLINTANDSTEEL_USE,
			SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE,
			SoundEvents.ENTITY_GENERIC_BIG_FALL,
			SoundEvents.ENTITY_GENERIC_BURN,
			SoundEvents.ENTITY_GENERIC_DEATH,
			SoundEvents.ENTITY_GENERIC_DRINK,
			SoundEvents.ENTITY_GENERIC_EAT,
			SoundEvents.ENTITY_GENERIC_EXPLODE,
			SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE,
			SoundEvents.ENTITY_GENERIC_HURT,
			SoundEvents.ENTITY_GENERIC_SMALL_FALL,
			SoundEvents.ENTITY_GENERIC_SPLASH,
			SoundEvents.ENTITY_GENERIC_SWIM,
			SoundEvents.ENTITY_GHAST_AMBIENT,
			SoundEvents.ENTITY_GHAST_DEATH,
			SoundEvents.ENTITY_GHAST_HURT,
			SoundEvents.ENTITY_GHAST_SCREAM,
			SoundEvents.ENTITY_GHAST_SHOOT,
			SoundEvents.ENTITY_GHAST_WARN,
			SoundEvents.BLOCK_GLASS_BREAK,
			SoundEvents.BLOCK_GLASS_FALL,
			SoundEvents.BLOCK_GLASS_HIT,
			SoundEvents.BLOCK_GLASS_PLACE,
			SoundEvents.BLOCK_GLASS_STEP,
			SoundEvents.BLOCK_GRASS_BREAK,
			SoundEvents.BLOCK_GRASS_FALL,
			SoundEvents.BLOCK_GRASS_HIT,
			SoundEvents.BLOCK_GRASS_PLACE,
			SoundEvents.BLOCK_GRASS_STEP,
			SoundEvents.BLOCK_GRAVEL_BREAK,
			SoundEvents.BLOCK_GRAVEL_FALL,
			SoundEvents.BLOCK_GRAVEL_HIT,
			SoundEvents.BLOCK_GRAVEL_PLACE,
			SoundEvents.BLOCK_GRAVEL_STEP,
			SoundEvents.ENTITY_GUARDIAN_AMBIENT,
			SoundEvents.ENTITY_GUARDIAN_AMBIENT_LAND,
			SoundEvents.ENTITY_GUARDIAN_ATTACK,
			SoundEvents.ENTITY_GUARDIAN_DEATH,
			SoundEvents.ENTITY_GUARDIAN_DEATH_LAND,
			SoundEvents.ENTITY_GUARDIAN_FLOP,
			SoundEvents.ENTITY_GUARDIAN_HURT,
			SoundEvents.ENTITY_GUARDIAN_HURT_LAND,
			SoundEvents.ITEM_HOE_TILL,
			SoundEvents.ENTITY_HORSE_AMBIENT,
			SoundEvents.ENTITY_HORSE_ANGRY,
			SoundEvents.ENTITY_HORSE_ARMOR,
			SoundEvents.ENTITY_HORSE_BREATHE,
			SoundEvents.ENTITY_HORSE_DEATH,
			SoundEvents.ENTITY_HORSE_EAT,
			SoundEvents.ENTITY_HORSE_GALLOP,
			SoundEvents.ENTITY_HORSE_HURT,
			SoundEvents.ENTITY_HORSE_JUMP,
			SoundEvents.ENTITY_HORSE_LAND,
			SoundEvents.ENTITY_HORSE_SADDLE,
			SoundEvents.ENTITY_HORSE_STEP,
			SoundEvents.ENTITY_HORSE_STEP_WOOD,
			SoundEvents.ENTITY_HOSTILE_BIG_FALL,
			SoundEvents.ENTITY_HOSTILE_DEATH,
			SoundEvents.ENTITY_HOSTILE_HURT,
			SoundEvents.ENTITY_HOSTILE_SMALL_FALL,
			SoundEvents.ENTITY_HOSTILE_SPLASH,
			SoundEvents.ENTITY_HOSTILE_SWIM,
			SoundEvents.ENTITY_HUSK_AMBIENT,
			SoundEvents.ENTITY_HUSK_DEATH,
			SoundEvents.ENTITY_HUSK_HURT,
			SoundEvents.ENTITY_HUSK_STEP,
			SoundEvents.ENTITY_IRONGOLEM_ATTACK,
			SoundEvents.ENTITY_IRONGOLEM_DEATH,
			SoundEvents.ENTITY_IRONGOLEM_HURT,
			SoundEvents.ENTITY_IRONGOLEM_STEP,
			SoundEvents.BLOCK_IRON_DOOR_CLOSE,
			SoundEvents.BLOCK_IRON_DOOR_OPEN,
			SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
			SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN,
			SoundEvents.ENTITY_ITEMFRAME_ADD_ITEM,
			SoundEvents.ENTITY_ITEMFRAME_BREAK,
			SoundEvents.ENTITY_ITEMFRAME_PLACE,
			SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM,
			SoundEvents.ENTITY_ITEMFRAME_ROTATE_ITEM,
			SoundEvents.ENTITY_ITEM_BREAK,
			SoundEvents.ENTITY_ITEM_PICKUP,
			SoundEvents.BLOCK_LADDER_BREAK,
			SoundEvents.BLOCK_LADDER_FALL,
			SoundEvents.BLOCK_LADDER_HIT,
			SoundEvents.BLOCK_LADDER_PLACE,
			SoundEvents.BLOCK_LADDER_STEP,
			SoundEvents.BLOCK_LAVA_AMBIENT,
			SoundEvents.BLOCK_LAVA_EXTINGUISH,
			SoundEvents.BLOCK_LAVA_POP,
			SoundEvents.ENTITY_LEASHKNOT_BREAK,
			SoundEvents.ENTITY_LEASHKNOT_PLACE,
			SoundEvents.BLOCK_LEVER_CLICK,
			SoundEvents.ENTITY_LIGHTNING_IMPACT,
			SoundEvents.ENTITY_LIGHTNING_THUNDER,
			SoundEvents.ENTITY_LINGERINGPOTION_THROW,
			SoundEvents.ENTITY_LLAMA_AMBIENT,
			SoundEvents.ENTITY_LLAMA_ANGRY,
			SoundEvents.ENTITY_LLAMA_CHEST,
			SoundEvents.ENTITY_LLAMA_DEATH,
			SoundEvents.ENTITY_LLAMA_EAT,
			SoundEvents.ENTITY_LLAMA_HURT,
			SoundEvents.ENTITY_LLAMA_SPIT,
			SoundEvents.ENTITY_LLAMA_STEP,
			SoundEvents.ENTITY_LLAMA_SWAG,
			SoundEvents.ENTITY_MAGMACUBE_DEATH,
			SoundEvents.ENTITY_MAGMACUBE_HURT,
			SoundEvents.ENTITY_MAGMACUBE_JUMP,
			SoundEvents.ENTITY_MAGMACUBE_SQUISH,
			SoundEvents.BLOCK_METAL_BREAK,
			SoundEvents.BLOCK_METAL_FALL,
			SoundEvents.BLOCK_METAL_HIT,
			SoundEvents.BLOCK_METAL_PLACE,
			SoundEvents.BLOCK_METAL_PRESSPLATE_CLICK_OFF,
			SoundEvents.BLOCK_METAL_PRESSPLATE_CLICK_ON,
			SoundEvents.BLOCK_METAL_STEP,
			SoundEvents.ENTITY_MINECART_INSIDE,
			SoundEvents.ENTITY_MINECART_RIDING,
			SoundEvents.ENTITY_MOOSHROOM_SHEAR,
			SoundEvents.ENTITY_MULE_AMBIENT,
			SoundEvents.ENTITY_MULE_CHEST,
			SoundEvents.ENTITY_MULE_DEATH,
			SoundEvents.ENTITY_MULE_HURT,
			SoundEvents.MUSIC_CREATIVE,
			SoundEvents.MUSIC_CREDITS,
			SoundEvents.MUSIC_DRAGON,
			SoundEvents.MUSIC_END,
			SoundEvents.MUSIC_GAME,
			SoundEvents.MUSIC_MENU,
			SoundEvents.MUSIC_NETHER,
			SoundEvents.BLOCK_NOTE_BASEDRUM,
			SoundEvents.BLOCK_NOTE_BASS,
			SoundEvents.BLOCK_NOTE_HARP,
			SoundEvents.BLOCK_NOTE_HAT,
			SoundEvents.BLOCK_NOTE_PLING,
			SoundEvents.BLOCK_NOTE_SNARE,
			SoundEvents.ENTITY_PAINTING_BREAK,
			SoundEvents.ENTITY_PAINTING_PLACE,
			SoundEvents.ENTITY_PIG_AMBIENT,
			SoundEvents.ENTITY_PIG_DEATH,
			SoundEvents.ENTITY_PIG_HURT,
			SoundEvents.ENTITY_PIG_SADDLE,
			SoundEvents.ENTITY_PIG_STEP,
			SoundEvents.BLOCK_PISTON_CONTRACT,
			SoundEvents.BLOCK_PISTON_EXTEND,
			SoundEvents.ENTITY_PLAYER_ATTACK_CRIT,
			SoundEvents.ENTITY_PLAYER_ATTACK_KNOCKBACK,
			SoundEvents.ENTITY_PLAYER_ATTACK_NODAMAGE,
			SoundEvents.ENTITY_PLAYER_ATTACK_STRONG,
			SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP,
			SoundEvents.ENTITY_PLAYER_ATTACK_WEAK,
			SoundEvents.ENTITY_PLAYER_BIG_FALL,
			SoundEvents.ENTITY_PLAYER_BREATH,
			SoundEvents.ENTITY_PLAYER_BURP,
			SoundEvents.ENTITY_PLAYER_DEATH,
			SoundEvents.ENTITY_PLAYER_HURT,
			SoundEvents.ENTITY_PLAYER_LEVELUP,
			SoundEvents.ENTITY_PLAYER_SMALL_FALL,
			SoundEvents.ENTITY_PLAYER_SPLASH,
			SoundEvents.ENTITY_PLAYER_SWIM,
			SoundEvents.ENTITY_POLAR_BEAR_AMBIENT,
			SoundEvents.ENTITY_POLAR_BEAR_BABY_AMBIENT,
			SoundEvents.ENTITY_POLAR_BEAR_DEATH,
			SoundEvents.ENTITY_POLAR_BEAR_HURT,
			SoundEvents.ENTITY_POLAR_BEAR_STEP,
			SoundEvents.ENTITY_POLAR_BEAR_WARNING,
			SoundEvents.BLOCK_PORTAL_AMBIENT,
			SoundEvents.BLOCK_PORTAL_TRAVEL,
			SoundEvents.BLOCK_PORTAL_TRIGGER,
			SoundEvents.ENTITY_RABBIT_AMBIENT,
			SoundEvents.ENTITY_RABBIT_ATTACK,
			SoundEvents.ENTITY_RABBIT_DEATH,
			SoundEvents.ENTITY_RABBIT_HURT,
			SoundEvents.ENTITY_RABBIT_JUMP,
			SoundEvents.RECORD_11,
			SoundEvents.RECORD_13,
			SoundEvents.RECORD_BLOCKS,
			SoundEvents.RECORD_CAT,
			SoundEvents.RECORD_CHIRP,
			SoundEvents.RECORD_FAR,
			SoundEvents.RECORD_MALL,
			SoundEvents.RECORD_MELLOHI,
			SoundEvents.RECORD_STAL,
			SoundEvents.RECORD_STRAD,
			SoundEvents.RECORD_WAIT,
			SoundEvents.RECORD_WARD,
			SoundEvents.BLOCK_REDSTONE_TORCH_BURNOUT,
			SoundEvents.BLOCK_SAND_BREAK,
			SoundEvents.BLOCK_SAND_FALL,
			SoundEvents.BLOCK_SAND_HIT,
			SoundEvents.BLOCK_SAND_PLACE,
			SoundEvents.BLOCK_SAND_STEP,
			SoundEvents.ENTITY_SHEEP_AMBIENT,
			SoundEvents.ENTITY_SHEEP_DEATH,
			SoundEvents.ENTITY_SHEEP_HURT,
			SoundEvents.ENTITY_SHEEP_SHEAR,
			SoundEvents.ENTITY_SHEEP_STEP,
			SoundEvents.ITEM_SHIELD_BLOCK,
			SoundEvents.ITEM_SHIELD_BREAK,
			SoundEvents.ITEM_SHOVEL_FLATTEN,
			SoundEvents.ENTITY_SHULKER_AMBIENT,
			SoundEvents.BLOCK_SHULKER_BOX_CLOSE,
			SoundEvents.BLOCK_SHULKER_BOX_OPEN,
			SoundEvents.ENTITY_SHULKER_BULLET_HIT,
			SoundEvents.ENTITY_SHULKER_BULLET_HURT,
			SoundEvents.ENTITY_SHULKER_CLOSE,
			SoundEvents.ENTITY_SHULKER_DEATH,
			SoundEvents.ENTITY_SHULKER_HURT,
			SoundEvents.ENTITY_SHULKER_HURT_CLOSED,
			SoundEvents.ENTITY_SHULKER_OPEN,
			SoundEvents.ENTITY_SHULKER_SHOOT,
			SoundEvents.ENTITY_SHULKER_TELEPORT,
			SoundEvents.ENTITY_SILVERFISH_AMBIENT,
			SoundEvents.ENTITY_SILVERFISH_DEATH,
			SoundEvents.ENTITY_SILVERFISH_HURT,
			SoundEvents.ENTITY_SILVERFISH_STEP,
			SoundEvents.ENTITY_SKELETON_AMBIENT,
			SoundEvents.ENTITY_SKELETON_DEATH,
			SoundEvents.ENTITY_SKELETON_HORSE_AMBIENT,
			SoundEvents.ENTITY_SKELETON_HORSE_DEATH,
			SoundEvents.ENTITY_SKELETON_HORSE_HURT,
			SoundEvents.ENTITY_SKELETON_HURT,
			SoundEvents.ENTITY_SKELETON_SHOOT,
			SoundEvents.ENTITY_SKELETON_STEP,
			SoundEvents.ENTITY_SLIME_ATTACK,
			SoundEvents.BLOCK_SLIME_BREAK,
			SoundEvents.ENTITY_SLIME_DEATH,
			SoundEvents.BLOCK_SLIME_FALL,
			SoundEvents.BLOCK_SLIME_HIT,
			SoundEvents.ENTITY_SLIME_HURT,
			SoundEvents.ENTITY_SLIME_JUMP,
			SoundEvents.BLOCK_SLIME_PLACE,
			SoundEvents.ENTITY_SLIME_SQUISH,
			SoundEvents.BLOCK_SLIME_STEP,
			SoundEvents.ENTITY_SMALL_MAGMACUBE_DEATH,
			SoundEvents.ENTITY_SMALL_MAGMACUBE_HURT,
			SoundEvents.ENTITY_SMALL_MAGMACUBE_SQUISH,
			SoundEvents.ENTITY_SMALL_SLIME_DEATH,
			SoundEvents.ENTITY_SMALL_SLIME_HURT,
			SoundEvents.ENTITY_SMALL_SLIME_JUMP,
			SoundEvents.ENTITY_SMALL_SLIME_SQUISH,
			SoundEvents.ENTITY_SNOWBALL_THROW,
			SoundEvents.ENTITY_SNOWMAN_AMBIENT,
			SoundEvents.ENTITY_SNOWMAN_DEATH,
			SoundEvents.ENTITY_SNOWMAN_HURT,
			SoundEvents.ENTITY_SNOWMAN_SHOOT,
			SoundEvents.BLOCK_SNOW_BREAK,
			SoundEvents.BLOCK_SNOW_FALL,
			SoundEvents.BLOCK_SNOW_HIT,
			SoundEvents.BLOCK_SNOW_PLACE,
			SoundEvents.BLOCK_SNOW_STEP,
			SoundEvents.ENTITY_SPIDER_AMBIENT,
			SoundEvents.ENTITY_SPIDER_DEATH,
			SoundEvents.ENTITY_SPIDER_HURT,
			SoundEvents.ENTITY_SPIDER_STEP,
			SoundEvents.ENTITY_SPLASH_POTION_BREAK,
			SoundEvents.ENTITY_SPLASH_POTION_THROW,
			SoundEvents.ENTITY_SQUID_AMBIENT,
			SoundEvents.ENTITY_SQUID_DEATH,
			SoundEvents.ENTITY_SQUID_HURT,
			SoundEvents.BLOCK_STONE_BREAK,
			SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
			SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON,
			SoundEvents.BLOCK_STONE_FALL,
			SoundEvents.BLOCK_STONE_HIT,
			SoundEvents.BLOCK_STONE_PLACE,
			SoundEvents.BLOCK_STONE_PRESSPLATE_CLICK_OFF,
			SoundEvents.BLOCK_STONE_PRESSPLATE_CLICK_ON,
			SoundEvents.BLOCK_STONE_STEP,
			SoundEvents.ENTITY_STRAY_AMBIENT,
			SoundEvents.ENTITY_STRAY_DEATH,
			SoundEvents.ENTITY_STRAY_HURT,
			SoundEvents.ENTITY_STRAY_STEP,
			SoundEvents.ENCHANT_THORNS_HIT,
			SoundEvents.ENTITY_TNT_PRIMED,
			SoundEvents.ITEM_TOTEM_USE,
			SoundEvents.BLOCK_TRIPWIRE_ATTACH,
			SoundEvents.BLOCK_TRIPWIRE_CLICK_OFF,
			SoundEvents.BLOCK_TRIPWIRE_CLICK_ON,
			SoundEvents.BLOCK_TRIPWIRE_DETACH,
			SoundEvents.UI_BUTTON_CLICK,
			SoundEvents.ENTITY_VEX_AMBIENT,
			SoundEvents.ENTITY_VEX_CHARGE,
			SoundEvents.ENTITY_VEX_DEATH,
			SoundEvents.ENTITY_VEX_HURT,
			SoundEvents.ENTITY_VILLAGER_AMBIENT,
			SoundEvents.ENTITY_VILLAGER_DEATH,
			SoundEvents.ENTITY_VILLAGER_HURT,
			SoundEvents.ENTITY_VILLAGER_NO,
			SoundEvents.ENTITY_VILLAGER_TRADING,
			SoundEvents.ENTITY_VILLAGER_YES,
			SoundEvents.VINDICATION_ILLAGER_AMBIENT,
			SoundEvents.VINDICATION_ILLAGER_DEATH,
			SoundEvents.ENTITY_VINDICATION_ILLAGER_HURT,
			SoundEvents.BLOCK_WATERLILY_PLACE,
			SoundEvents.BLOCK_WATER_AMBIENT,
			SoundEvents.WEATHER_RAIN,
			SoundEvents.WEATHER_RAIN_ABOVE,
			SoundEvents.ENTITY_WITCH_AMBIENT,
			SoundEvents.ENTITY_WITCH_DEATH,
			SoundEvents.ENTITY_WITCH_DRINK,
			SoundEvents.ENTITY_WITCH_HURT,
			SoundEvents.ENTITY_WITCH_THROW,
			SoundEvents.ENTITY_WITHER_AMBIENT,
			SoundEvents.ENTITY_WITHER_BREAK_BLOCK,
			SoundEvents.ENTITY_WITHER_DEATH,
			SoundEvents.ENTITY_WITHER_HURT,
			SoundEvents.ENTITY_WITHER_SHOOT,
			SoundEvents.ENTITY_WITHER_SKELETON_AMBIENT,
			SoundEvents.ENTITY_WITHER_SKELETON_DEATH,
			SoundEvents.ENTITY_WITHER_SKELETON_HURT,
			SoundEvents.ENTITY_WITHER_SKELETON_STEP,
			SoundEvents.ENTITY_WITHER_SPAWN,
			SoundEvents.ENTITY_WOLF_AMBIENT,
			SoundEvents.ENTITY_WOLF_DEATH,
			SoundEvents.ENTITY_WOLF_GROWL,
			SoundEvents.ENTITY_WOLF_HOWL,
			SoundEvents.ENTITY_WOLF_HURT,
			SoundEvents.ENTITY_WOLF_PANT,
			SoundEvents.ENTITY_WOLF_SHAKE,
			SoundEvents.ENTITY_WOLF_STEP,
			SoundEvents.ENTITY_WOLF_WHINE,
			SoundEvents.BLOCK_WOODEN_DOOR_CLOSE,
			SoundEvents.BLOCK_WOODEN_DOOR_OPEN,
			SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE,
			SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN,
			SoundEvents.BLOCK_WOOD_BREAK,
			SoundEvents.BLOCK_WOOD_BUTTON_CLICK_OFF,
			SoundEvents.BLOCK_WOOD_BUTTON_CLICK_ON,
			SoundEvents.BLOCK_WOOD_FALL,
			SoundEvents.BLOCK_WOOD_HIT,
			SoundEvents.BLOCK_WOOD_PLACE,
			SoundEvents.BLOCK_WOOD_PRESSPLATE_CLICK_OFF,
			SoundEvents.BLOCK_WOOD_PRESSPLATE_CLICK_ON,
			SoundEvents.BLOCK_WOOD_STEP,
			SoundEvents.ENTITY_ZOMBIE_AMBIENT,
			SoundEvents.ENTITY_ZOMBIE_ATTACK_DOOR_WOOD,
			SoundEvents.ENTITY_ZOMBIE_ATTACK_IRON_DOOR,
			SoundEvents.ENTITY_ZOMBIE_BREAK_DOOR_WOOD,
			SoundEvents.ENTITY_ZOMBIE_DEATH,
			SoundEvents.ENTITY_ZOMBIE_HORSE_AMBIENT,
			SoundEvents.ENTITY_ZOMBIE_HORSE_DEATH,
			SoundEvents.ENTITY_ZOMBIE_HORSE_HURT,
			SoundEvents.ENTITY_ZOMBIE_HURT,
			SoundEvents.ENTITY_ZOMBIE_INFECT,
			SoundEvents.ENTITY_ZOMBIE_PIG_AMBIENT,
			SoundEvents.ENTITY_ZOMBIE_PIG_ANGRY,
			SoundEvents.ENTITY_ZOMBIE_PIG_DEATH,
			SoundEvents.ENTITY_ZOMBIE_PIG_HURT,
			SoundEvents.ENTITY_ZOMBIE_STEP,
			SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT,
			SoundEvents.ENTITY_ZOMBIE_VILLAGER_CONVERTED,
			SoundEvents.ENTITY_ZOMBIE_VILLAGER_CURE,
			SoundEvents.ENTITY_ZOMBIE_VILLAGER_DEATH,
			SoundEvents.ENTITY_ZOMBIE_VILLAGER_HURT,
			SoundEvents.ENTITY_ZOMBIE_VILLAGER_STEP
			};
	
	

}
