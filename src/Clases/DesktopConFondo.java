package Clases;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class DesktopConFondo extends JDesktopPane { 
    private Image imagen;
    
    public DesktopConFondo() { } 
    
    public DesktopConFondo(String nombreImagen) { 
        if (nombreImagen != null) { 
            imagen = new ImageIcon(getClass().getResource(nombreI­magen)).getImage(); 
        } 
    } 
    public DesktopConFondo(Image imagenInicial) { 
        if (imagenInicial != null) { 
            imagen = imagenInicial; 
        } 
    } 
    public void setImagen(String nombreImagen) { 
        if (nombreImagen != null) { 
            imagen = new ImageIcon(getClass().getResource(nombreI­magen)).getImage(); 
        } else { 
            imagen = null; 
        } 
        repaint(); 
    } 
    public void setImagen(Image nuevaImagen) { 
        imagen = nuevaImagen; repaint(); 
    } 
    @Override public void paint(Graphics g) { 
        if (imagen != null) { 
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this); setOpaque(false); 
        } else{ 
            setOpaque(true); 
        } 
        super.paint(g); 
    }
}

