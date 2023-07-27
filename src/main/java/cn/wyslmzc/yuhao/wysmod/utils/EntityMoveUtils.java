package cn.wyslmzc.yuhao.wysmod.utils;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3d;

public class EntityMoveUtils {
    public static void PushToPos(Entity entity, double x, double y, double z, double strength) {
        entity.push((entity.position().x - x) * strength,
                (entity.position().y - y) * strength,
                (entity.position().z - z) * strength);
    }

    public static void PushToForward(Entity entity, double strength) {
        Vector3d v = Vector3d.directionFromRotation(entity.getRotationVector().x, entity.getRotationVector().y);
        entity.push(v.x * strength, v.y * strength, v.z * strength);
    }

    public static void PushToAngle(Entity entity, Vector2f angle, double strength) {
        Vector3d v = Vector3d.directionFromRotation(angle.x, angle.y);
        entity.push(v.x * strength, v.y * strength, v.z * strength);
    }
}