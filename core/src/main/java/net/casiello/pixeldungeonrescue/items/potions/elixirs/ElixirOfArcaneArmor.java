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

package net.casiello.pixeldungeonrescue.items.potions.elixirs;

import net.casiello.pixeldungeonrescue.actors.buffs.ArcaneArmor;
import net.casiello.pixeldungeonrescue.actors.buffs.Buff;
import net.casiello.pixeldungeonrescue.actors.hero.Hero;
import net.casiello.pixeldungeonrescue.items.potions.exotic.PotionOfEarthenArmor;
import net.casiello.pixeldungeonrescue.items.quest.GooBlob;
import net.casiello.pixeldungeonrescue.sprites.ItemSpriteSheet;

public class ElixirOfArcaneArmor extends Elixir {
	
	{
		image = ItemSpriteSheet.ELIXIR_ARCANE;
	}
	
	@Override
	public void apply(Hero hero) {
		Buff.affect(hero, ArcaneArmor.class).set(5 + hero.lvl/2, 80);
	}
	
	@Override
	public int price() {
		//prices of ingredients
		return quantity * (50 + 40);
	}
	
	public static class Recipe extends net.casiello.pixeldungeonrescue.items.Recipe.SimpleRecipe {
		
		{
			inputs =  new Class[]{PotionOfEarthenArmor.class, GooBlob.class};
			inQuantity = new int[]{1, 1};
			
			cost = 8;
			
			output = ElixirOfArcaneArmor.class;
			outQuantity = 1;
		}
		
	}
}
