/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2019 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package net.casiello.pixeldungeonrescue.actors.buffs;

import net.casiello.pixeldungeonrescue.actors.blobs.Blizzard;
import net.casiello.pixeldungeonrescue.actors.blobs.ConfusionGas;
import net.casiello.pixeldungeonrescue.actors.blobs.CorrosiveGas;
import net.casiello.pixeldungeonrescue.actors.blobs.Electricity;
import net.casiello.pixeldungeonrescue.actors.blobs.Fire;
import net.casiello.pixeldungeonrescue.actors.blobs.Freezing;
import net.casiello.pixeldungeonrescue.actors.blobs.Inferno;
import net.casiello.pixeldungeonrescue.actors.blobs.ParalyticGas;
import net.casiello.pixeldungeonrescue.actors.blobs.Regrowth;
import net.casiello.pixeldungeonrescue.actors.blobs.SmokeScreen;
import net.casiello.pixeldungeonrescue.actors.blobs.StenchGas;
import net.casiello.pixeldungeonrescue.actors.blobs.StormCloud;
import net.casiello.pixeldungeonrescue.actors.blobs.ToxicGas;
import net.casiello.pixeldungeonrescue.actors.blobs.Web;
import net.casiello.pixeldungeonrescue.actors.mobs.NewTengu;
import net.casiello.pixeldungeonrescue.messages.Messages;
import net.casiello.pixeldungeonrescue.ui.BuffIndicator;
import com.watabou.noosa.Image;

public class BlobImmunity extends FlavourBuff {
	
	{
		type = buffType.POSITIVE;
	}
	
	public static final float DURATION	= 20f;
	
	@Override
	public int icon() {
		return BuffIndicator.IMMUNITY;
	}
	
	@Override
	public void tintIcon(Image icon) {
		greyIcon(icon, 5f, cooldown());
	}
	
	@Override
	public String toString() {
		return Messages.get(this, "name");
	}

	{
		//all harmful blobs
		immunities.add( Blizzard.class );
		immunities.add( ConfusionGas.class );
		immunities.add( CorrosiveGas.class );
		immunities.add( Electricity.class );
		immunities.add( Fire.class );
		immunities.add( Freezing.class );
		immunities.add( Inferno.class );
		immunities.add( ParalyticGas.class );
		immunities.add( Regrowth.class );
		immunities.add( SmokeScreen.class );
		immunities.add( StenchGas.class );
		immunities.add( StormCloud.class );
		immunities.add( ToxicGas.class );
		immunities.add( Web.class );

		immunities.add(NewTengu.FireAbility.FireBlob.class);
		immunities.add(NewTengu.BombAbility.BombBlob.class);
	}

	@Override
	public String desc() {
		return Messages.get(this, "desc", dispTurns());
	}
}