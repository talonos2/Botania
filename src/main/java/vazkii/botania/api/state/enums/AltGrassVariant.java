/**
 * This class was created by <williewillus>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * <p>
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 */
package vazkii.botania.api.state.enums;

import net.minecraft.util.IStringSerializable;

import java.util.Locale;

public enum AltGrassVariant implements IStringSerializable {
	DRY,
	GOLDEN,
	VIVID,
	SCORCHED,
	INFUSED,
	MUTATED;

	@Override
	public String getName() {
		return this.name().toLowerCase(Locale.ROOT);
	}

}
