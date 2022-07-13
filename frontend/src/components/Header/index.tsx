import logo from '../../assets/img/logo.svg'
import "./style.css"

function Header() {
  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={logo} alt="" />
        <h1>DSMeta</h1>
        <p>
          Developed by{" "}
          <strong>
            <em>
              <a href="https://github.com/hstt-coder">hstt-coder</a>
            </em>
          </strong>
        </p>
      </div>
    </header>
  );
}

export default Header;
